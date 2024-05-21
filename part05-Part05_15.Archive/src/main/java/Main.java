
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList to store items
        ArrayList<Item> items = new ArrayList<>();
        
        // Keep prompting for user input until empty identifier or name
        // is entered
        while (true) {
            // Prompt the user for the identifier
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();           
            if (identifier.isEmpty()) {
                break;
            }
                 
            // Prompt the user for the name
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            // Create an Item object with the provided identifer and name
            Item item = new Item(identifier, name);          
            
            // Check if the item already exists in the list
            if (!(items.contains(item))) {
                // Add the item to the list if it doesn't already exist
                items.add(item);
            }
            
        }

        // Print the items in the list
        System.out.println("==Items==");    
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
