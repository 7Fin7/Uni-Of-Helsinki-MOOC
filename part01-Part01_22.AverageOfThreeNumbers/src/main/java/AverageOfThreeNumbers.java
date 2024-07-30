// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt and input first number
        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        // Prompt and input second number
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        // Prompt and input third number
        System.out.println("Give the third number:");
        int z = Integer.valueOf(scanner.nextLine());
        
        // Calculate average
        double average = 1.0 * (x + y + z) / 3;
        
        // Print average
        System.out.println("The average is " + average);
    }
}
