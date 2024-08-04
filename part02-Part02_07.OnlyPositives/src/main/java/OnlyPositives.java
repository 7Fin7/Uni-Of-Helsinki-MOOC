// Scanner class for user input
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop
        while (true) {
            // Prompt and input number
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check if number is negative
            if (num < 0) {
                // If negative print unsuitable and next iteration
                System.out.println("Unsuitable number");
                continue;
            }
            
            // Check if number is 0
            if (num == 0) {
                // If 0 exit loop
                break;
            }
            
            // If not negative and not 0 then print number power 2
            System.out.println(Math.pow(num, 2));
        }
    }
}
