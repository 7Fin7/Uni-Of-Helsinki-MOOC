
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number from user and convert to integer
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check if input number is 0
            if (number == 0) {
                // If number is 0, break loop
                break;
            }
            
            // If not 0, add input number to numbers list
            numbers.add(number);
        }
        
        // Calculate sum of second and third number and print result
        int sum = numbers.get(1) + numbers.get(2);
        System.out.println(sum);
    }
}
