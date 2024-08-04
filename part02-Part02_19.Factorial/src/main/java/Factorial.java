// Scanner class for user input
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt and input number
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        
        // Initialise result to 1
        int result = 1;
        
        // Loop from 1 until num, inclusive
        for (int i = 1; i <= num; i++) {
            // Multiply result by current value of i
            result *= i;
        }
        
        // Print results
        System.out.println("Factorial: " + result);
    }
}
