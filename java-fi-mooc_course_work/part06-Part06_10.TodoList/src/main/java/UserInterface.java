
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
public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        
        OUTER:
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break OUTER;
                case "add":
                    System.out.println("To add: ");
                    String toAdd = scanner.nextLine();
                    this.todoList.add(toAdd);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    Integer removed = scanner.nextInt();
                    this.todoList.remove(removed);
                    break;
                default:
                    break;
            }
        }
    }
}
