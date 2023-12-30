package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Label instructionText = new Label("Enter your name and start:");
        TextField input = new TextField();
        Button button = new Button("Start");
        
        GridPane layout = new GridPane();
        
        layout.add(instructionText, 0, 0);
        layout.add(input, 0, 1);
        layout.add(button, 0, 2);
        
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene inputScene = new Scene(layout);
        
        button.setOnAction(event -> {
            Label welcome = new Label("Welcome " + input.getText() + "!");
            StackPane welcomeLayout = new StackPane();
            welcomeLayout.setPrefSize(300, 180);
            welcomeLayout.getChildren().add(welcome);
            welcomeLayout.setAlignment(Pos.CENTER);
            Scene welcomeScene = new Scene(welcomeLayout);
            window.setScene(welcomeScene);
        });
        
        window.setScene(inputScene);
        window.show();
        
    }
}
