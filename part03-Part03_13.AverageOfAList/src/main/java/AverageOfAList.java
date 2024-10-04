
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int input = Integer.valueOf(scanner.nextLine());
            
            // Exit condition
            if (input == -1) {
                break;
            }
            
            // If number != -1 then add to list
            numbers.add(input);
        }
        
        // Initialise sum and size
        int sum = 0;
        int size = numbers.size();
        
        // Loop through numbers in list and add to sum
        for (int number: numbers) {
            sum += number;
        }
        
        // Calculate average and print results
        double average = (double) sum / size;
        System.out.println("Average: " + average);
    }
}
