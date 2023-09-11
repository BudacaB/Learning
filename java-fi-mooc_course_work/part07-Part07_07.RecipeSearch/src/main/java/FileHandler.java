
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class FileHandler {
    
    private final String fileName;
    private final ArrayList<ArrayList<String>> recipes;

    public FileHandler(String fileName) {
        this.fileName = fileName;
        this.recipes = new ArrayList<>();
        this.initializeScanner();
    }
    
    private void initializeScanner() {
        int recipeCounter = 0;
        recipes.add(new ArrayList<>());
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) recipes.get(recipeCounter).add(line);
                else {
                    recipeCounter += 1;
                    recipes.add(new ArrayList<>());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    void list() {
        System.out.println("Recipes: ");
        recipes.forEach((recipe) -> {
            System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
        });
    }

    void searchName(String searchName) {
        System.out.println("Recipes: ");
        recipes.stream().filter((recipe) -> (recipe.get(0).contains(searchName))).forEachOrdered((recipe) -> {
            System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
        });
    }

    void searchTime(String searchTime) {
        System.out.println("Recipes: ");
        int searchTimeInt = Integer.parseInt(searchTime);
        recipes.stream()
                .filter(recipe -> Integer.parseInt(recipe.get(1)) <= searchTimeInt)
                .forEachOrdered(recipe -> {
                    System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                });
    }

    void searchIngredient(String searchIngredient) {
        System.out.println("Recipes: ");
        recipes.stream()
                .filter(recipe -> recipe.contains(searchIngredient))
                .forEachOrdered(recipe -> {
                    System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                });
    }
    
}
