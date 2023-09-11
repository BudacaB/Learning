
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
public class CommandHandler {
    
    private BirdHandler birdHandler;
    private Scanner scan;

    public CommandHandler(Scanner scan) {
        this.scan = scan;
        this.birdHandler = new BirdHandler();
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                
                Bird bird = new Bird(name, latinName);
                birdHandler.add(bird);
            }
            
            if (command.equals("All")) {
                birdHandler.listAll();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                
                birdHandler.listOne(name);
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                
                birdHandler.addObservation(name);
            }
        }
    }
    
}
