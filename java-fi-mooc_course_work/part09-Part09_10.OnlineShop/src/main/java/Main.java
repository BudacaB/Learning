
import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        // Test your app here
        
        Map test = new HashMap<String, Integer>();
        
        test.put("test", 5);
        
        System.out.println(test.get("test"));
    }
}
