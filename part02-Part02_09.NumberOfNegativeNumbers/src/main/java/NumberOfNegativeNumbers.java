// Scanner class for user input
import java.util.Scanner;

public class NumberOfNegativeNumbers {

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
            
            // Check is number equals 0
            if (num == 0) {
                // If 0, break loop
                break;
            }
            
            // Check if number is negative
            if (num < 0) {
                // If negative, increment count
                count += 1;
            }
        }
        
        // Print total amount of negative numbers
        System.out.println("Number of negative numbers: " + count);
    }
}
