
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("end");
                break;
            }
            
            int cubeString = Integer.valueOf(input);
            Double cube = Math.pow(cubeString, 3);
            
            System.out.println(cube.intValue());
        }

    }
}
