import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            System.out.println("");
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("");
            System.out.println("Publication year: ");
            String pubYear = scanner.nextLine();
            
            books.add(new Book(name, Integer.valueOf(pages), Integer.valueOf(pubYear)));
        }
        
        System.out.println("What information will be printed? ");
        String print = scanner.nextLine();
        
        if (print.equals("everything")) {
            books.forEach(book -> System.out.println(book));
        } else if (print.equals("name")) {
            books.forEach(book -> System.out.println(book.getName()));
        }

    }
}
