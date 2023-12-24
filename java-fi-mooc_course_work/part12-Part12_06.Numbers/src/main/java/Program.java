
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("How many random numbers should be printed?");
        List<Integer> nums = new ArrayList<>();
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            int randomInt = rand.nextInt(11);
            nums.add(randomInt);
        }
        
        nums.forEach(num -> System.out.println(num));

    }

}
