
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double positivesSum = 0;
        double numOfPositives = 0;
        double average = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                positivesSum += num;
                numOfPositives += 1;
            }
        }
        
        if (numOfPositives > 0) {
            average = positivesSum / numOfPositives;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
