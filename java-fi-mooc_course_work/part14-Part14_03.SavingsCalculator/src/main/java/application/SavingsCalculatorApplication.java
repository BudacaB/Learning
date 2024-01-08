package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        xAxis.setLabel("Years");
        yAxis.setLabel("Savings");
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series interestSeries = new XYChart.Series();
        lineChart.getData().addAll(savingsSeries, interestSeries);
        
        BorderPane layout = new BorderPane();
        VBox topContainer = new VBox(10); // 10 is the spacing between elements
        topContainer.setPadding(new Insets(10)); // Padding around the VBox
        
        // Monthly Savings Slider
        BorderPane savingsPane = new BorderPane();
        Label savingsLabel = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setMajorTickUnit(25); // Adjust as needed
        savingsSlider.setMinorTickCount(4); // Adjust as needed
        Label savingsValueLabel = new Label(String.format("%.2f", savingsSlider.getValue()));
        // slider logic
        savingsSlider.setValue(30);
        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            savingsValueLabel.setText(String.format("%.2f", newValue));
            savingsSeries.getData().clear();
            for (int i = 0; i <= 30; i++) {
               savingsSeries.getData().add(new XYChart.Data(i, newValue.doubleValue() * 12.0 * i));
            }
        });
       
        savingsPane.setLeft(savingsLabel);
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsValueLabel);

        // Yearly Interest Rate Slider
        BorderPane interestPane = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMajorTickUnit(10);
        interestSlider.setMinorTickCount(4);
        Label interestValueLabel = new Label(String.format("%.2f", interestSlider.getValue()));
        // slider logic
        interestSlider.setValue(1);
        interestSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            interestValueLabel.setText(String.format("%.2f", newValue));
            interestSeries.getData().clear();
            for (int i = 0; i <= 30; i++) {
                double savingsValue = savingsSlider.getValue();
                double totalSavings = savingsValue * 12 * i;
                double interest = totalSavings * (newValue.doubleValue() / 100);
//                double savingWithInterest = totalSavings + interest;    
                double savingWithInterest = calculateFutureValue(savingsSlider.getValue(), newValue.doubleValue(), i);    
                interestSeries.getData().add(new XYChart.Data(i, savingWithInterest));
                System.out.println(interest);
                System.out.println(savingWithInterest);
            }
        });
        
        interestPane.setLeft(interestLabel);
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestValueLabel);
        
        topContainer.getChildren().addAll(savingsPane, interestPane);
        
        layout.setTop(topContainer);
        layout.setCenter(lineChart);
        
        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    public static double calculateFutureValue(double monthlySaving, double annualRate, int years) {
        double totalSavings = monthlySaving * 12; // Total savings per year
        double futureValue = 0;

        for (int i = 1; i <= years; i++) {
            futureValue += totalSavings; // Add this year's savings
            futureValue = futureValue * (1 + annualRate / 100); // Apply compound interest
        }

        return futureValue;
    }

}
