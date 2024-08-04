// Scanner class for user input
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input number
        int num = Integer.valueOf(scanner.nextLine());
        
        // Loop from 0 to the value of num, inclusive
        for (int i = 0; i <= num; i++) {
            // Print the current value of i
            System.out.println(i);
        }
    }
}
