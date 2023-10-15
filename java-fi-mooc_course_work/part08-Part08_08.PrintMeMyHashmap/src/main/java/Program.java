
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashMap) {
        hashMap.keySet().forEach(key -> {
            System.out.println(key);
        });
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.keySet().forEach(key -> {
            if (key.contains(text)) System.out.println(key);
        });
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.keySet().forEach(key -> {
            if (key.contains(text)) System.out.println(hashMap.get(key));
        });
    }
}
