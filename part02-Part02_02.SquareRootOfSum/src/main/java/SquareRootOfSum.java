// Scanner class for user input
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input first number
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // Input second number
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // Calculate sum
        int sum = num1 + num2;
        
        // Calculate square root of sum and print
        System.out.println(Math.sqrt(sum));
    }
}
