// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input first number
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());
        
        // Prompt and input second number
        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());
        
        // Check if the first number is equal to the second number
        if (first == second) {
            // If they are the same, print "Same!"
            System.out.println("Same!");
        } else if (first > second) {
            // If the first number is greater than the second number, 
            // print "The first was larger than the second!"
            System.out.println("The first was larger than the second!");
        } else {
            // If the second number is greater than the first number, 
            // print "The second was larger than the first!"
            System.out.println("The second was larger than the first!");
        }

    }
}
