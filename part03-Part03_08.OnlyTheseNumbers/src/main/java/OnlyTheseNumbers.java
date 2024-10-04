
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals -1
            if (number == -1) {
                // If number is -1, break loop
                break;
            }
            
            // Add input number to numbers list
            numbers.add(number);
        }
        
        // Prompt and input where to start index
        System.out.println("From where?");
        int start = Integer.valueOf(scanner.nextLine());
        
        // Prompt and input end index
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.next());
        
        // Loop from start index to end index
        for (int i = start; i <= end; i++) {
            // Print value in numbers list at current index 'i'
            System.out.println(numbers.get(i));
        }
    }
}
