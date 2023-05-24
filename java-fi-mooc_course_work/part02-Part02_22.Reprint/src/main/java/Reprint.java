
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int times = Integer.valueOf(scanner.nextLine());
        
        while (0 < times) {
            printText();
            times -= 1;
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
