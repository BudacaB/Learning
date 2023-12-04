package FlightControl;

import java.util.Scanner;
import logic.FlightControl;
import ui.TextUI;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        
        TextUI textUI = new TextUI(new FlightControl(), new Scanner(System.in));
        
        textUI.start();
    }
}
