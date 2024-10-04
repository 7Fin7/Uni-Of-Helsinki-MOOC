
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // infinite loop
        while (true) {
            // Input number from user and convert to integer
            int luku = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals -1
            if (luku == -1) {
                // If number is -1, break loop
                break;
            }
            
            // Add input number to numbers list 
            numbers.add(luku);
        }
        
        // Loop through each element in the numbers list using its index
        for (int i = 0; i < numbers.size(); i++) {
            // Print the element at the current index 'i'
            System.out.println(numbers.get(i));
        }
    }
}
