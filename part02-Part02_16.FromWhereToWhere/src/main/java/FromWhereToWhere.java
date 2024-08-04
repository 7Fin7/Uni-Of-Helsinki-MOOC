// Scanner class for user input
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt and enter end number
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        
        // Prompt and enter start number
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        // Loop from start to end, inclusive
        for (int i = start; i <= end; i++) {
            // Print the current value of i
            System.out.println(i);
        }
    }
}
