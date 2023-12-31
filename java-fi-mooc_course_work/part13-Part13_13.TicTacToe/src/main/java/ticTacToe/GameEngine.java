/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author bogdan
 */
public class GameEngine {
    
    private int[][] game;
    private String turn;

    public GameEngine() {
        this.game = new int[3][3];
        this.turn = "X";
    }
    
    public int placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= this.game.length || y >= this.game.length) {
            return 0;
        }

        if (Objects.equals(this.game[y][x], 0)) {
            this.game[y][x] = value;
            changeTurn();
            return 1;
        }
        
        return 0;
    }
    
    public int checkWinner() {
        if (rowWinner() == 1 || columnWinner() == 1 || diagonalWinner() == 1) return 1;
        if (rowWinner() == -1 || columnWinner() == -1 || diagonalWinner() == -1) return -1;
        return 0;
    }
    
    private int rowWinner() {
        ArrayList<Integer> sumsOfRows = new ArrayList<>();
        
        for (int[] row : this.game){
            int sum = 0;
            for (int value: row) {
                sum += value;
            }
            sumsOfRows.add(sum); 
        }
        
        if (sumsOfRows.contains(-3)) return -1;
        if (sumsOfRows.contains(3)) return 1;
        return 0;
    }

    private int columnWinner() {
        ArrayList<Integer> sumsOfColumns = new ArrayList<>();
        
        for (int c = 0; c < this.game.length; c++) {
            int sum = 0;
            for (int r = 0; r < this.game.length; r++) {
                sum += this.game[r][c];
            }
            sumsOfColumns.add(sum);
        }
        
        if (sumsOfColumns.contains(-3)) return -1;
        if (sumsOfColumns.contains(3)) return 1;
        return 0;
    }

    private int diagonalWinner() {
        ArrayList<Integer> sumsOfDiags = new ArrayList<>();
        
        int firstDiagSum = 0;
        for (int i = 0; i < this.game.length; i++) {
            firstDiagSum += this.game[i][i];
        }
        
        int secondDiagSum = 0;
        for (int i = 0; i < this.game.length; i++) {
            secondDiagSum += this.game[i][this.game.length - i - 1];
        }
     
        sumsOfDiags.add(firstDiagSum);
        sumsOfDiags.add(secondDiagSum);
        
        if (sumsOfDiags.contains(-3)) return -1;
        if (sumsOfDiags.contains(3)) return 1;
        return 0;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < game.length; row++) {
            for (int col = 0; col < game[row].length; col++) {
                result.append(game[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
    
    public String getTurn() {
        return this.turn;
    }
    
    public void changeTurn() {
        if (this.turn.equals("X")) {
            this.turn = "O";
        } else {
            this.turn = "X";
        }
    }
    
}
