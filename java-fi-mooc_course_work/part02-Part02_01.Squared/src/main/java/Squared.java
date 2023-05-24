
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        
        int result = num * num;
        
        System.out.println("The square of " + num + " is " + result);

    }
}
