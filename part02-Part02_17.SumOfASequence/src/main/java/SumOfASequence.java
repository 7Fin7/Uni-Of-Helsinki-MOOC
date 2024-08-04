// Scanner class for user input
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise result to 0
        int result = 0;
        
        // Prompt and enter last number
        System.out.println("Last number");
        int num = Integer.valueOf(scanner.nextLine());
        
        // Loop from 1 to last number, inclusive
        for (int i = 1; i <= num; i++) {
            // Add current value of i to result
            result += i;
        }
        
        // Print the result
        System.out.println("The sum is " + result);
    }
}
