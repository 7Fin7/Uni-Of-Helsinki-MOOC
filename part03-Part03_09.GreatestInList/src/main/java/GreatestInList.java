
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int input = Integer.valueOf(scanner.nextLine());
            
            // Check if number is -1
            if (input == -1) {
                // If number is -1, break loop
                break;
            }

            // Add number to list
            list.add(input);
        }
        
        // Line break
        System.out.println("");

        // Implement finding the greatest number in the list here
        // Initially set the greatest number to the first element
        int greatest = list.get(0);
        
        // Loop through the remaining numbers
        for (int i = 1; i < list.size(); i++) {
            // Check if  'greatest' is smaller than current number
            if (greatest < list.get(i)) {
                // If smaller assign current number is 'greatest'
                greatest = list.get(i);
            }
        }
        
        // Print 'greatest'
        System.out.println("The greatest number: " + greatest);
    }
}
