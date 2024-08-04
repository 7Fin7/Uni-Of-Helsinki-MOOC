// Scanner class for user input
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialise count, sum and average to 0
        int count = 0;
        int sum = 0;
        double average = 0.0;
        
        // Start an infinite loop
        while (true) {
            // Input number
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals 0
            if (num == 0) {
                // If number is 0, break loop
                break;
            }
            
            // Check if number is positive
            if (num > 0) {
                // If postive increment count
                count += 1;
                // Also add number to sum
                sum += num;
            }
        }
        
        // Check if count is greater than 0
        if (count > 0) {
            // If count is greater than zero calculate average and print
            average = (double) sum / count;
            System.out.println(average);
        } else {
            // If count is zero, print cannot calculate
            System.out.println("Cannot calculate average");
        }
    }
}
