
public class Averaging {

    // Method to return sum of 4 numbers
    public static int sum(int number1, int number2, int number3, int number4) {
        // Return sum
        return number1 + number2 + number3 + number4;
    }

    // Method to return average of 4 numbers
    public static double average(int number1, int number2, int number3, int number4) {
        // Calculate average using sum method and return value
        return sum(number1, number2, number3, number4) / 4.0;
    }

    // Main method
    public static void main(String[] args) {
        // Call method average with 4 numbers and store result
        double result = average(4, 3, 6, 1);
        // Print results
        System.out.println("Average: " + result);
    }
}
