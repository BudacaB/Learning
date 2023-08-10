
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
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        OUTER:
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "end":
                    break OUTER;
                case "add":
                    System.out.println("Word: ");
                    String word = scanner.nextLine();
                    System.out.println("Translations: ");
                    String translation = scanner.nextLine();
                    simpleDictionary.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String toBeTranslated = scanner.nextLine();
                    String answer;
                    answer = simpleDictionary.translate(toBeTranslated);
                    if (answer == null) {
                        System.out.println("Word " + toBeTranslated + " was not found");
                    } else {
                        System.out.println("Translation: " + answer);
                    }   break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
        
        System.out.println("Bye bye!");
    }
    
}
