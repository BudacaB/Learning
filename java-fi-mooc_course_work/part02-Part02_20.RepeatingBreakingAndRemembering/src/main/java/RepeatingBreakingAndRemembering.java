
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int numOfNums = 0;
        double mean = 0;
        int numOfEvens = 0;
        int numOfOdds = 0;
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0) {
                numOfEvens += 1;
            } else {
                numOfOdds += 1;
            }
            
            sum += num;
            numOfNums += 1;
        }
        
        double doubleSum = sum;
        double doubleNumOfNums = numOfNums;
        mean = doubleSum / doubleNumOfNums;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + numOfEvens);
        System.out.println("Odd: " + numOfOdds);

    }
}
