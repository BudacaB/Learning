package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) throws FileNotFoundException {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        File file = new File("partiesdata.tsv");
//        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
//        NumberAxis yAxis = new NumberAxis(0, 30, 5);
//
//        // set the titles for the axes
//        xAxis.setLabel("Year");
//        yAxis.setLabel("Relative support (%)");
//        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
//        try (Scanner scanner = new Scanner(file)) {
//            // Read the first line to get the years (headers)
//            String[] years = scanner.nextLine().split("\t");
//
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] values = line.split("\t");
//                String partyName = values[0];
//
//                XYChart.Series series = new XYChart.Series();
//                series.setName(partyName);
//
//                for (int i = 1; i < values.length; i++) {
//                    if (!values[i].equals("-")) {
//                        double value = Double.parseDouble(values[i]);
//                        series.getData().add(new XYChart.Data<>(Integer.parseInt(years[i]), value));
//                    }
//                }
//
//                lineChart.getData().add(series);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        
        Map<String, Map<Integer, Double>> values = getValues();
        
        values.keySet().stream().forEach(party -> {
            XYChart.Series series = new XYChart.Series();
            series.setName(party);
            
            values.get(party).entrySet().stream().forEach(pair -> {
                series.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(series);
        });
        
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    public Map<String, Map<Integer, Double>> getValues () {
        File file = new File("partiesdata.tsv");
        Map<String, Map<Integer, Double>> dataMap = new HashMap<>();
        
        try (Scanner scanner = new Scanner(file)) {
            String[] years = scanner.nextLine().split("\t");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split("\t");
                
                String partyName = values[0];
                Map<Integer, Double> yearsData = new HashMap<>();
                
                for (int i = 1; i < values.length; i++) {
                    if (!values[i].equals("-")) {
                        yearsData.put(Integer.parseInt(years[i]), Double.parseDouble(values[i]));
                    }
                }
                
                dataMap.put(partyName, yearsData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return dataMap;
    }

}
