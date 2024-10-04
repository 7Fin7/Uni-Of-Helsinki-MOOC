
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise maxAge to 0 and oldest to empty string
        int maxAge = 0;
        String oldest = "";
        
        // Infinite loop
        while (true) {
            // Input string
            String input = scanner.nextLine();
            
            // If string is empty break
            if (input.isEmpty()) {
                break;
            }
            
            // Split string into name and age
            String[] parts = input.split(",");
            
            // Initialise name
            String name = parts[0];
            
            // Initialise age and convert to integer
            int age = Integer.parseInt(parts[1]);
            
            // If age is greater than maxAge assign to maxAge and oldest
            if (age > maxAge) {
                maxAge = age;
                oldest = name;
            }
        }
        
        // Print oldest name
        System.out.println("Name of the oldest: " + oldest);
    }
}
