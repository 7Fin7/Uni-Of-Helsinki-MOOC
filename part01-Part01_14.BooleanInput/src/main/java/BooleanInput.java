// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Boolean input
        System.out.println("Write something:");
        
        // Read input from user and convert to Boolean, assign to value
        boolean value = Boolean.valueOf(scanner.nextLine());
        
        // Print value
        System.out.println("True or false? " + value);
    }
}
