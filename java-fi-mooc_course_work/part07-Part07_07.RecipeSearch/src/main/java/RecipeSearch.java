
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        
        FileHandler fileHandler = new FileHandler(file);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) break;
            if (command.equals("list")) fileHandler.list();
            else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchName = scanner.nextLine();
                fileHandler.searchName(searchName);
            }
            else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                String searchTime = scanner.nextLine();
                fileHandler.searchTime(searchTime);
            }
            else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchIngredient = scanner.nextLine();
                fileHandler.searchIngredient(searchIngredient);
            }
        }
            
    }

}
