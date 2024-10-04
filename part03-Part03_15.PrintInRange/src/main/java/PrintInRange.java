
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        // Call method on numbers list with values 0 and 5
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        // Call method on numbers list with values 0 and 5
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
    // Print numbers in the list within range
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        // Loop through numbers
        for (int number: numbers) {
            // Check if number is within range and print
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
