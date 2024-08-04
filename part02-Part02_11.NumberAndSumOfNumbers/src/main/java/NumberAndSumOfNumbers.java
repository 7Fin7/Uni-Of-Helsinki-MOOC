// Scanner class for user input
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise count and sum to 0
        int count = 0;
        int sum = 0;
        
        // Start an infinite loop
        while (true) {
            // Prompt and input number
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals 0
            if (num == 0) {
                // If number is 0, break loop
                break;
            }
            
            // Increment the count
            count += 1;
            
            // Add the number to the sum
            sum += num;
        }
        
        // Print results
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
