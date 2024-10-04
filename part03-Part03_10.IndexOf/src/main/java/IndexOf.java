
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int input = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals -1
            if (input == -1) {
                // If number is -1, break loop
                break;
            }

            // Add number to numbers list
            list.add(input);
        }

        // Line break
        System.out.println("");

        // Implement here finding the indices of a number
        // Prompt and input target
        System.out.println("Search for?");
        int target = Integer.valueOf(scanner.nextLine());
        
        // Loop through ArrayList
        for (int i = 0; i < list.size(); i++) {
            // Check if 'target' equals current number
            if (target == list.get(i)) {
                // If they are equal print accordingly
                System.out.println(target + " is at index " + i);
            }
        }
    }
}
