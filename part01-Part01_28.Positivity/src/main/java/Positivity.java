// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input number
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        
        // If number is positive print "The number is positive."
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            // If number is not positive print "The number is not positive."
            System.out.println("The number is not positive.");
        }
    }
}
