
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            if (command.equals("add") && amount > 0) {
                if (amount + first > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }
            
            if (command.equals("move") && amount > 0) {
                if (amount > first) {
                    if (second + first > 100) {
                        second = 100;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    if (second + first > 100) {
                        second = 100;
                    } else {
                        second += amount;                        
                    }
                    first -= amount;
                }
            }
            
            if (command.equals("remove")) {
                if (second - amount < 0) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }

}