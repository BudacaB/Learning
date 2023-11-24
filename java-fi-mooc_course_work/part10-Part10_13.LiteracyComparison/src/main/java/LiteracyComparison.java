
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        String filePath = "literacy.csv";
        Path path = Paths.get(filePath);
        
        try(Stream<String> lines = Files.lines(path)) {
            lines.map(line -> line.split(","))
                    .sorted(Comparator.comparingDouble(line -> Double.valueOf(line[5])))
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + ")" +
                            ", " + line[2].split(" ")[1] + ", " + line[5]));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
