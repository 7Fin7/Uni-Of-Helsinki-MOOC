
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Read input from user
            String input = scanner.nextLine();
            
            // Check if input is empty
            if (input.equals("")) {
                // If empty, break loop
                break;
            }

            // If not empty, add input to list
            list.add(input);
        }
        
        // Store list size in variable
        int size = list.size();
        
        // Calculate and print last item in list
        System.out.println(list.get(size - 1));
    }
}
