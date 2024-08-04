// Scanner class for user input
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input number
        int num = Integer.valueOf(scanner.next());
        
        // Loop while num is less than or equal to 100
        while (num <= 100) {
            // Print the current value of num
            System.out.println(num);            
            // Increment num by 1
            num++;
        }
    }
}
