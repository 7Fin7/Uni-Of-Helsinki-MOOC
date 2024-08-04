// Scanner class for user input
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input first number
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // Input second number
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // Check if first number is greater than second number
        if (num1 > num2) {
            // If first number is greater, print first number is greater
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            // If first number is less than second number
            // print first number is smaller
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            // If neither conditions above are true numbers are equal
            // and print this
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
