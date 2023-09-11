
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        PointsHandler pointsHandler = new PointsHandler();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer points = scanner.nextInt();
            
            if (points == -1) {
                System.out.println("Point average (all): " + pointsHandler.average());
                System.out.println("Point average (passing): " + pointsHandler.passingAverage());
                System.out.println("Pass percentage: " + pointsHandler.passPercentage());
                System.out.print("Grade distribution:");
                pointsHandler.gradeDistribution();
                break;
            }
            if (0 <= points && points <= 100) pointsHandler.addPoints(points);
        }
        
        
    }
}
