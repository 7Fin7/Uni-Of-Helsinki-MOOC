// Scanner class for user input
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop
        while (true) {
            // Prompt and input string
            System.out.println("Shall we carry on?");
            String string = scanner.nextLine();
            
            // Check if user's input is 'no'
            if (string.equals("no")) {
                // If so, break out the loop and stop asking
                break;
            }
        }
    }
}
