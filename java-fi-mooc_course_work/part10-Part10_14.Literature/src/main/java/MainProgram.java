
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();
            
            if (book.isEmpty()) break;
            
            System.out.print("Input the age recommendation: ");
            String age = scanner.nextLine();
            
            books.add(new Book(book, Integer.valueOf(age)));
        }
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        books.forEach(book -> System.out.println(book.getName() + 
                " (recommended for " + book.getAge() + " year-olds or older)"));

    }

}
