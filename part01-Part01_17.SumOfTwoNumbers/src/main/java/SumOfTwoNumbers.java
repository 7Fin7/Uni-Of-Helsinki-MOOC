// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt and input first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        // Prompt and input second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate sum and print
        System.out.println("The sum of the numbers is " + (first + second));
    }
}
