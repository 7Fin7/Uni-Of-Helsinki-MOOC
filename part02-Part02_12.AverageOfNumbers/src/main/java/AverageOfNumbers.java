// Scanner class for user input
import java.util.Scanner;

public class AverageOfNumbers {

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
            
            // Increment count
            count += 1;
            
            // Add number to the sum
            sum += num;
        }
        
        // Calculate the average of the numbers
        double average = 1.0 * sum / count;
        
        // Print the results
        System.out.println("Average of the numbers: " + average);
    }
}
