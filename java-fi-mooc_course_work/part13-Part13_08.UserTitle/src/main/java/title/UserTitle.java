package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle(getParameters().getNamed().get("title"));
        window.show();
    }

}