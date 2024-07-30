// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        // If year is less than 2015 print "Ancient history!"
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
