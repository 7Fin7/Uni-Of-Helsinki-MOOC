
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        // Call method on numbers
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    // Method to return sum of numbers in list
    public static int sum(ArrayList<Integer> numbers) {
        // Initialise sum
        int sum = 0;
        // Loop through numbers and add to sum
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
