
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input first value:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Input second value:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        double sqr = Math.sqrt(num1 + num2);
        System.out.println(sqr);

    }
}
