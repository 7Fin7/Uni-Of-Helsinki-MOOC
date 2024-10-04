
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise the maximum age variable
        int maxAge = 0;
        
        // Infinite loop
        while (true) {
            // Input string
            String input = scanner.nextLine();
            
            // If the input is empty, break out of the loop
            if (input.isEmpty()) {
                break;
            }
            
            // Split the input line into name and age using comma
            String[] parts = input.split(",");
            // Convert age string to integer
            int age = Integer.parseInt(parts[1]);
            
            // Update maxAge if the current age is greater
            if (age > maxAge) {
                maxAge = age;
            }
        }
        
        // Print the age of the oldest person
        System.out.println("Age of the oldest: " + maxAge);
    }
}
