import java.nio.file.Path;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Path.of(fileName))) {
            
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                String yearNumbering = age == 1 ? "year" : "years";
                
                System.out.println(name + ", age: " + age + " " + yearNumbering);
            }
         
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
