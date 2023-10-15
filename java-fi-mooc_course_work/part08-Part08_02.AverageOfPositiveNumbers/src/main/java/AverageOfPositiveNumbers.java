
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        while (true) {
            Integer input = scanner.nextInt();
            
            if (input == 0) {
                if (numbers.isEmpty()) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                
                int sum = 0;
                sum = numbers.stream().map(num -> num).reduce(sum, Integer::sum);
                System.out.println(sum * 1.0 / numbers.size());
                break;
            }
            
            if (input > 0) {
                numbers.add(input);
            }
        }
    }
}
