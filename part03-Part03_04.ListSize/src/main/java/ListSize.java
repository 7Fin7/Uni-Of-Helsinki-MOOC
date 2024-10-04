
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store items
        ArrayList<String> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input String from user
            String input = scanner.nextLine();
            
            // Check if input is empty string
            if (input.equals("")) {
                // If empty string, break loop
                break;
            }

            // If input not empty, add to list
            list.add(input);
        }
        
        // Print total size of list
        System.out.println("In total: " + list.size());
    }
}
