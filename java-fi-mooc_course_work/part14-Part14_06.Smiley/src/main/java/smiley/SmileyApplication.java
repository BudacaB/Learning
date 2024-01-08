package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, paintingCanvas.getWidth(), paintingCanvas.getHeight());

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(160, 120, 40, 40);
        painter.fillRect(460, 120, 40, 40);
        painter.fillRect(130, 320, 40, 40);
        painter.fillRect(170, 360, 40, 40);
        painter.fillRect(210, 360, 40, 40);
        painter.fillRect(250, 360, 40, 40);
        painter.fillRect(290, 360, 40, 40);
        painter.fillRect(330, 360, 40, 40);
        painter.fillRect(370, 360, 40, 40);
        painter.fillRect(410, 360, 40, 40);
        painter.fillRect(450, 360, 40, 40);
        painter.fillRect(490, 320, 40, 40);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
