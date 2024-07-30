// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input number
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        
        // Check if the number is divisible by 2
        if (num % 2 == 0) {
            // Print that the number is even
            System.out.println("Number " + num + " is even.");
        } else {
            // If the number is not divisible by 2, print that the number is odd
            System.out.println("Number " + num + " is odd.");
        }
        
        
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd!
    }
}
