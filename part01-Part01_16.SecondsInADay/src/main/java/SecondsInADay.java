// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for days to convert to seconds
        System.out.println("How many days would you like to convert to seconds?"); 
        
        // Read input
        int days = Integer.valueOf(scanner.nextLine());
        
        // Calculate seconds
        int seconds = days * (60*60*24);
        
        // Print seconds
        System.out.println(seconds);
    }
}
