package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please provide a title: ");
        String title = reader.nextLine();

        Application.launch(UserTitle.class, "--title=" + title);

    }

}
