
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }
            
            if (command.equals("move") && amount > 0) {
                if (amount > first.contains()) {
                    if (second.contains() + first.contains() > 100) {
                        second.add(100);
                    } else {
                        second.add(first.contains());
                    }
                    first.remove(100);
                } else {
                    if (second.contains() + first.contains() > 100) {
                        second.add(100);
                    } else {
                        second.add(amount);                        
                    }
                    first.remove(amount);
                }
            }
            
            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
