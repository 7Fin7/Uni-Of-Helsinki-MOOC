// Scanner class for user input
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input number
        int num = Integer.valueOf(scanner.nextLine());
        
        // If number is negative multiply by -1 and print result
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            // Otherwise number is positive and print number
            System.out.println(num);
        }
    }
}
