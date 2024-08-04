// Scanner class for user input
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop
        while (true) {
            // Prompt and input number
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals 4
            if (num == 4) {
                // If number is 4 stop loop
                break;
            }
        }
    }
}
