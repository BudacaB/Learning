package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    
    private GameEngine gameEngine;

    @Override
    public void init() throws Exception {
        this.gameEngine = new GameEngine();
    }

    @Override
    public void start(Stage window) throws Exception {
        
        BorderPane layout = new BorderPane(); 
        Label status = new Label("Turn " + gameEngine.getTurn());
        status.setFont(Font.font("Monospaced", 40));
        GridPane components = new GridPane();
        
        Button topLeft = new Button("");
        topLeft.setFont(Font.font("Monospaced", 40));
        Button topMid = new Button("");
        topMid.setFont(Font.font("Monospaced", 40));
        Button topRight = new Button("");
        topRight.setFont(Font.font("Monospaced", 40));
        Button midLeft = new Button("");
        midLeft.setFont(Font.font("Monospaced", 40));
        Button center = new Button("");
        center.setFont(Font.font("Monospaced", 40));
        Button midRight = new Button("");
        midRight.setFont(Font.font("Monospaced", 40));
        Button bottomLeft = new Button("");
        bottomLeft.setFont(Font.font("Monospaced", 40));
        Button bottomMid = new Button("");
        bottomMid.setFont(Font.font("Monospaced", 40));
        Button bottomRight = new Button("");
        bottomRight.setFont(Font.font("Monospaced", 40));
        components.add(topLeft, 0, 0);
        components.add(topMid, 1, 0);
        components.add(topRight, 2, 0);
        components.add(midLeft, 0, 1);
        components.add(center, 1, 1);
        components.add(midRight, 2, 1);
        components.add(bottomLeft, 0, 2);
        components.add(bottomMid, 1, 2);
        components.add(bottomRight, 2, 2);
        
        
        topLeft.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(0, 0) == 1) {
                topLeft.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        topMid.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(1, 0) == 1) {
                topMid.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        topRight.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(2, 0) == 1) {
                topRight.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        midLeft.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(0, 1) == 1) {
                midLeft.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        center.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(1, 1) == 1) {
                center.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        midRight.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(2, 1) == 1) {
                midRight.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        bottomLeft.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(0, 2) == 1) {
                bottomLeft.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        bottomMid.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(1, 2) == 1) {
                bottomMid.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
        bottomRight.setOnMouseClicked((event) -> {
            String turn = gameEngine.getTurn();
            if (makeMove(2, 2) == 1) {
                bottomRight.setText(turn);
                if (gameEngine.checkWinner() == 1 || gameEngine.checkWinner() == -1) {
                    status.setText("The end!");
                    components.setDisable(true);
                    return;
                }
                status.setText("Turn " + gameEngine.getTurn());
            }
        });
                
        
        components.setHgap(10);
        components.setVgap(10);
        components.setPadding(new Insets(10, 10, 10, 10));
        
        layout.setTop(status);
        layout.setCenter(components);
        
        Scene scene = new Scene(layout, 300, 350);
        
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    private int makeMove(int x, int y) {
            if (gameEngine.getTurn().equals("X")) {
                return gameEngine.placeValue(x, y, 1);
            } else {
                return gameEngine.placeValue(x, y, -1);
            }
    }

}
