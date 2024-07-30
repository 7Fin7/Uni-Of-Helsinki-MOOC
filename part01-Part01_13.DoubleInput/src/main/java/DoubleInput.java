// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.println("Give a number:");
        
        // Read input from user and convert to Double, assign to value
        double value = Double.valueOf(scanner.nextLine());
        
        // Print value
        System.out.println("You gave the number " + value);
    }
}
