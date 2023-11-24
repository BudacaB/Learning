
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> nums = new ArrayList<>();
        
        while(true) {
            int input = scanner.nextInt();
            
            if (input < 0) break;
            
            nums.add(input);
        }
        
        nums.stream().filter(num -> num <= 5 && num >= 1).forEach(num -> System.out.println(num));

    }
}
