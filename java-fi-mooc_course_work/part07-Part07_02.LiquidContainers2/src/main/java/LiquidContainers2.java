
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                    
        Container firstCon = new Container();
        Container secondCon = new Container();
        System.out.println("First: " + firstCon.toString());
        System.out.println("Second: " + secondCon.toString());
        
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
                firstCon.add(amount);
            }
            
            if (command.equals("move")) {
                if (amount > firstCon.contains()) {
                    secondCon.add(firstCon.contains());
                } else {
                    secondCon.add(amount);
                }
                firstCon.remove(amount);
            }
            
            if (command.equals("remove")) {
                secondCon.remove(amount);
            }
            
            System.out.println("First: " + firstCon.toString());
            System.out.println("Second: " + secondCon.toString());

        }
    }

}
