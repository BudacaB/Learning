package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        PixelReader largeImageReader = targetImage.getPixelReader();
        
        WritableImage smallTargetImage = new WritableImage(width / 2, height / 2);
        PixelWriter smallImageWriter = smallTargetImage.getPixelWriter();
        PixelReader smallImageReader = smallTargetImage.getPixelReader();
        
        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();
                
                Color newColor = new Color(red, green, blue, opacity);
                                
                if (xCoordinate == 0 && yCoordinate == 498) {
                    System.out.println(color.toString());
                    System.out.println(newColor.toString());
                    System.out.println(yCoordinate / 2);
                }
                
                if (xCoordinate == 0 && yCoordinate == 499) {
                    System.out.println(color.toString());
                    System.out.println(newColor.toString());
                    System.out.println(yCoordinate / 2);
                }

                smallImageWriter.setColor(xCoordinate / 2, yCoordinate / 2, newColor);

                xCoordinate += 2;
            }

            yCoordinate += 2;
        }
        
        copy(height, width, 0, 0, smallImageReader, imageWriter);
        copy(height, width, 0, width / 2, smallImageReader, imageWriter);
        copy(height, width, height / 2, 0, smallImageReader, imageWriter);
        copy(height, width, height / 2, width / 2, smallImageReader, imageWriter);

        yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = largeImageReader.getColor(xCoordinate, yCoordinate);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }
        
        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    private void copy(int height, int width, int yOffset, int xOffset, 
            PixelReader imageReader, PixelWriter imageWriter) {
        int yCoordinate = 0;
        while (yCoordinate < height / 2) {
            int xCoordinate = 0;
            while (xCoordinate < width / 2) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate + xOffset, yCoordinate + yOffset, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }
    }

}
