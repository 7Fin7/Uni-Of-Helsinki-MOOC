// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt and input speed
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        
        // If speed is greater than 20 execute
        if (speed > 120) {
            // Print ticket
            System.out.println("Speeding ticket!");
        }
    }
}
