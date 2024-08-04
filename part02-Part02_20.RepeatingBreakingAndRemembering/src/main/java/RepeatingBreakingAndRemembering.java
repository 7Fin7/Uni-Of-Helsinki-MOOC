// Scanner class for user input
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise variables to 0
        int result = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        // Prompt user for numbers
        System.out.println("Give numbers:");
        
        // Start infinite loop
        while (true) {
            // Input number
            int num = scanner.nextInt();
            
            // Breaking condition
            if (num == -1) {
                break;
            }
            
            // Increment odd and even numbers
            if (num % 2 == 0) {
                even++;
            } else {
                odd ++;
            }
                
            // Calculations
            result += num;
            count += 1;
        }
        double average = (double) result / count;
        
        // output
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + result);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
