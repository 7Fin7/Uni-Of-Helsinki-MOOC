
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Implement here a program that reads user input
        // until the user enters 9999
        
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int input = Integer.valueOf(scanner.nextLine());
            
            // Check if number equals 9999
            if (input == 9999) {
                // If number is 9999, break loop
                break;
            }
            
            // Add number to numbers list
            numbers.add(input);
        }
        
        
        // After that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        // Initially set smallest number to index 0
        int smallest = numbers.get(0);
        
        // Loop through rest of the numbers
        for (int i = 1; i < numbers.size(); i++) {
            // Check if 'smallest' is bigger than current number
            if (smallest > numbers.get(i)) {
                // If smallest is bigger set current number to 'smallest'
                smallest = numbers.get(i);
            }
        }
        
        // Print smallest number
        System.out.println("Smallest number: " + smallest);
        
        // Loop through numbers
        for (int i = 0; i < numbers.size(); i++) {
            // Check if 'smallest' equals current number
            if (smallest == numbers.get(i)) {
                // If 'smallest' is current number print found
                System.out.println("Found at index: " + i);
            }
        }
    }
}
