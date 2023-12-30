package textstatistics;

import java.util.Arrays;
import java.util.Comparator;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        Label letters = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(letters);
        texts.getChildren().add(wordsLabel);
        texts.getChildren().add(longest);

        TextArea text = new TextArea("");
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int chars = newValue.length();
            String[] words = newValue.split(" ");
            String longestWord = Arrays.stream(words).max(Comparator.comparingInt(String::length)).get();
            
            letters.setText("Letters: " + chars);
            wordsLabel.setText("Words: " + words.length);
            longest.setText("The longest word is: " + longestWord);
        });
        
        layout.setCenter(text);
        layout.setBottom(texts);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
