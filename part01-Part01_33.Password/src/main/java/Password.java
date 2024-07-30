// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scan
        Scanner scan = new Scanner(System.in);

        // Prompt user for password and store in String
        System.out.println("Password?");
        String password = scan.nextLine();
        
        // If password equals "Caput Draconis" print "Welcome!"
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            // Otherwise print "Off with you!"
            System.out.println("Off with you!");
        }
    }
}
