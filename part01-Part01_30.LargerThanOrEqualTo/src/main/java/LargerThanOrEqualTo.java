// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scan
        Scanner scan = new Scanner(System.in);
        
        // Prompt and input first number
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scan.nextLine());
        
        // Prompt and input second number
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scan.nextLine());
        
        // If first number is greater than the second number
        if (num1 > num2) {
            // Print first number is greater
            System.out.println("Greater number is: " + num1);
        } else if (num1 < num2) {
            // If first number is smaller than second number print
            // second number is greater
            System.out.println("Greater number is: " + num2);
        } else {
            // If numbers are equal print they are equal
            System.out.println("The numbers are equal!");
        }
    }
}
