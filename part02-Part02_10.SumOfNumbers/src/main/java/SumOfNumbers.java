// Scanner class for user input
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initalise sum to 0
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
            
            // Add number to the sum
            sum += num;
        }
        
        // Print the sum of the numbers
        System.out.println("Sum of the numbers: " + sum);
    }
}
