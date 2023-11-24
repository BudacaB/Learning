
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        List<String> nums = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if (input.equals("end")) break;
            
            nums.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String avgChoice = scanner.nextLine();
        
        Double avg;
        if (avgChoice.equals("p")) {
            avg = nums.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + avg);
        } else {
            avg = nums.stream().mapToInt(n -> Integer.valueOf(n)).filter(n -> n < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + avg);
        }

    }
}
