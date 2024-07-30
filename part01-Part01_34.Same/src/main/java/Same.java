// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input first String
        System.out.println("Enter the first string:");
        String text1 = scan.nextLine();
        
        // Prompt and input second String
        System.out.println("Enter the second string:");
        String text2 = scan.nextLine();
        
        // If first String equal Second string print "Same"
        if (text1.equals(text2)) {
            System.out.println("Same");
        } else {
            // Otherwise print "Different"
            System.out.println("Different");
        }
    }
}
