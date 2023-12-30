package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("Button");
        TextField textField = new TextField("Text");
        
        FlowPane cpmponents = new FlowPane();
        cpmponents.getChildren().add(button);
        cpmponents.getChildren().add(textField);
        
        Scene scene = new Scene(cpmponents);
        
        stage.setScene(scene);
        stage.show();
    }

}
