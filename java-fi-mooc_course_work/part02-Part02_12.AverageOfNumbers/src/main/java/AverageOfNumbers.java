
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double numOfValues = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num != 0) {
                sum += num;
                numOfValues += 1;
            }
        }
        
        double average = sum / numOfValues;
        System.out.println("Average of the numbers: " + average);

    }
}
