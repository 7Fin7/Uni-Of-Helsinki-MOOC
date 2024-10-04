
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store input strings
        ArrayList<String> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Read input from user
            String input = scanner.nextLine();
            
            // Check if input string is empty string
            if (input.equals("")) {
                // If input is empty, break loop
                break;
            }

            // If not empty, add input string to list
            list.add(input);
        }

        // Print third element in list
        // Assume at least three elements
        System.out.println(list.get(2));
    }
}
