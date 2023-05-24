
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + ((firstNum * 1.0 + secondNum + thirdNum) / 3));

    }
}
