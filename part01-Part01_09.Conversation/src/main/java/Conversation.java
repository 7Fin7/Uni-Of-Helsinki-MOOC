// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Simple conversation
        System.out.println("Greetings! How are you doing?");
        String firstInput = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String secondInput = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
