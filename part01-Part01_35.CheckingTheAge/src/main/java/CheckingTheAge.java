// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        // If age is above or equal to 0 AND age is less than or equal to 120
        if (age >= 0 && age <= 120) {
            // Print "OK"
            System.out.println("OK");
        } else {
            // Otherwise print "Impossible!"
            System.out.println("Impossible!");
        }
    }
}
