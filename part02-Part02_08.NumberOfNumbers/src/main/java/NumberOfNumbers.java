// Scanner class for user input
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise count to 0
        int count = 0;
        
        // Start an infinite loop
        while (true) {
            // Prompt and input number
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check if number is not 0
            if (num != 0) {
                // If not 0 then increment count by 1 and next iteration
                count += 1;
                continue;
            }
            
            // If number is 0, break out of the loop
            break;
        }
        
        // Print the total amount of numbers
        System.out.println("Number of numbers: " + count);
    }
}
