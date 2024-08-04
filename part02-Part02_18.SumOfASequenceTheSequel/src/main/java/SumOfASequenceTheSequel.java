// Scanner class for user input
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise result to 0
        int result = 0;
        
        // Prompt and input first number
        System.out.println("First number?");
        int start = scanner.nextInt();
        
        // Prompt and input last number
        System.out.println("Last number?");
        int end = scanner.nextInt();
        
        // Loop from start until end, inclusive
        for (int i = start; i <= end; i++) {
            // Add current value of i to result
            result += i;
        }
        
        // Print results
        System.out.println("The sum is " + result);
    }
}
