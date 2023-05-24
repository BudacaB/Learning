
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
        
            String[] splitString = input.split(" ");

            if (input.equals("")) {
                break;
            }

            for (String word : splitString) {
                System.out.println(word);
            }
        }
    }
}
