
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearSum = 0;
        int count = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            if (parts[0].length() > name.length()) {
                name = parts[0];
            }
            yearSum = yearSum + Integer.valueOf(parts[1]);
            count = count + 1;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * yearSum / count);

    }
}
