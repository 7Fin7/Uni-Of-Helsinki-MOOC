
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input string from user
            String input = scanner.nextLine();
            
            // Exit condition
            if (input.equals("")) {
                break;
            }

            // Add string to list
            list.add(input);
        }
        
        // Prompt and input string to search for
        System.out.println("Search for?");
        String input = scanner.nextLine();
        
        // Check if list contains search item and print accordingly
        if (list.contains(input)) {
            System.out.println(input + " was found!");
        } else {
            System.out.println(input + " was not found!");
        }
    }
}
