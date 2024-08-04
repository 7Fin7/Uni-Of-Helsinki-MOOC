// Scanner class for user input
import java.util.Scanner;

public class DivisibleByThree {

    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Call method divisibleByThreeInRange with arguments 3, 6
        divisibleByThreeInRange(3, 6);
    }
    
    // Method divisibleByThreeInRange
    public static void divisibleByThreeInRange(int beginning, int end) {
        // Loop that initialises 'i' to value 'beginning' until it
        // reaches 'end', inclusive, increment 'i' by 1
        for (int i = beginning; i <= end; i++) {
            // Check if i is divisible by 3
            if (i % 3 == 0) {
                // If divisible print 'i'
                System.out.println(i);
            }
        }
    }
}
