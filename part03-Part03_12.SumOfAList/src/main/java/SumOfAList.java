
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList to store numbers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Infinite loop
        while (true) {
            // Input number and convert to integer
            int input = Integer.valueOf(scanner.nextLine());
            
            // Exit condition
            if (input == -1) {
                break;
            }

            // If number != -1 then add to list
            list.add(input);
        }

        System.out.println("");

        // Initialise sum
        int sum = 0;
        
        // Loop through numbers in list and add to sum
        for (int number: list) {
            sum += number;
        }
        
        // Print results
        System.out.println("Sum: " + sum);
    }
}
