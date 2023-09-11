
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                    
        int firstConQty = 0;
        int secondConQty = 0;
        System.out.println("First: " + firstConQty + "/100");
        System.out.println("Second: " + secondConQty + "/100");
        
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                continue;
            }
            
            if (command.equals("add")) {
                if (amount >= 100 || amount + firstConQty >= 100) {
                    firstConQty = 100;
                } else {
                    firstConQty += amount;
                }
            }
            
            if (command.equals("move")) {
                if (amount >= firstConQty) {
                    if (firstConQty + secondConQty >= 100) {
                        secondConQty = 100;
                        firstConQty = 0;
                    } else {
                        secondConQty += firstConQty;
                        firstConQty = 0;
                    }
                } else if (amount + secondConQty >= 100) {
                    secondConQty = 100;
                    firstConQty -= amount;
                } else {
                    secondConQty += amount;
                    firstConQty -= amount;
                }
            }
            
            if (command.equals("remove")) {
                if (amount >= secondConQty) {
                    secondConQty = 0;
                } else {
                    secondConQty -= amount;
                }
            }
            
            System.out.println("First: " + firstConQty + "/100");
            System.out.println("Second: " + secondConQty + "/100");

        }
    }

}
