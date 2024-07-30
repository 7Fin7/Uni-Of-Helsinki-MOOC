// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name
        System.out.println("What's your name?");
        
        // Read the string written by the user
        String name = scanner.nextLine();
        
        // Print 'Hi' to user
        System.out.println("Hi " + name);
    }
}
