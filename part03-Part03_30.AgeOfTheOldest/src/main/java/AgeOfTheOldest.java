
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialise the maximum age variable
        int maxAge = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            // if the input is empty, break out of the loop
            if (input.isEmpty()) {
                break;
            }
            
            // split the input line into name and age using comma
            String[] parts = input.split(",");
            // convert age string to integer
            int age = Integer.parseInt(parts[1]);
            
            // update maxAge if the current age is greater
            if (age > maxAge) {
                maxAge = age;
            }
        }
        // print the age of the oldest person
        System.out.println("Age of the oldest: " + maxAge);
    }
}
