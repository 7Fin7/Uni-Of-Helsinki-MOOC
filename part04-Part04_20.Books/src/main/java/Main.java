import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed?");
        String printed = scanner.nextLine();
        
        for (Book book: books) {
            if (printed.equals("everything")) {
                System.out.println(book);
            } else if (printed.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
