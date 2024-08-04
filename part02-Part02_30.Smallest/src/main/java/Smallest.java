
public class Smallest {

    // Method returns smallest number
    public static int smallest(int number1, int number2) {
        // Check if number1 is less than number 2
        if (number1 < number2) {
            // If number1 is smaller return number1
            return number1;
        } else {
            // Otherwise return number2
            return number2;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Call smallest method with 2, 7 and store result in variable
        // 'result'
        int result = smallest(2, 7);
        // Print results
        System.out.println("Smallest: " + result);
    }
}
