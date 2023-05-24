import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Name: ");
            String tvName = scanner.nextLine();
            
            if (tvName.isEmpty()) {
                break;
            }
            
            System.out.println("");
            System.out.println("Duration: ");
            String duration = scanner.nextLine();
            
            programs.add(new TelevisionProgram(tvName, Integer.valueOf(duration)));
        }
        
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int seekedDuration = scanner.nextInt();
        
        programs.stream().filter((televisionProgram) -> (televisionProgram.getDuration() <= seekedDuration))
                .forEachOrdered((televisionProgram) -> { System.out.println(televisionProgram); });

    }
}
