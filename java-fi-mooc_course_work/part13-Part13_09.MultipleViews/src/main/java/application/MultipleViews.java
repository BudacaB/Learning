package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        BorderPane borderPane = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        borderPane.setTop(firstLabel);
        borderPane.setCenter(firstButton);
                
        VBox vBox = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        vBox.getChildren().addAll(secondButton, secondLabel);
        
        GridPane gridPane = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        gridPane.add(thirdLabel, 0, 0);
        gridPane.add(thirdButton, 1, 1);
        
        Scene first = new Scene(borderPane);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gridPane);
        
        firstButton.setOnAction(event -> {
            window.setScene(second);
        });
        
        secondButton.setOnAction(event -> {
            window.setScene(third);
        });
        
        thirdButton.setOnAction(event -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
        
    }

}
