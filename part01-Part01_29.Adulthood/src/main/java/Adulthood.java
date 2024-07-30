// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input user age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        // If age is greater than or equal to 18 print "You are an adult"
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            // If age is less than 18 print "You are not an adult"
            System.out.println("You are not an adult");
        }
    }
}
