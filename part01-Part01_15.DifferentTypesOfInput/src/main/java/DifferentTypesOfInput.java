// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and assign String value
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        // Prompt and assign Integer value
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        
        // Prompt and assign Double value
        System.out.println("Give a double:");
        double doub = Double.valueOf(scan.nextLine());
        
        
        // Prompt and assign Boolean value
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        // Print values
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + bool);
    }
}
