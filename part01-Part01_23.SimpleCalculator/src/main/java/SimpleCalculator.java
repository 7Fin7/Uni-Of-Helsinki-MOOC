// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt and input first number
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // Prompt and input second number
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // Calculate and print results
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
    }
}
