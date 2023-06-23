
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<String> nums = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Path.of(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (Integer.valueOf(row) <= upperBound && Integer.valueOf(row) >= lowerBound) {
                    nums.add(row);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Numbers: " + nums.size());

    }

}
