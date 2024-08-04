public class Summation {

    // Method that calculates sum of 4 numbers
    public static int sum(int num1, int num2, int num3, int num4) {
        // Return the sum
        return num1 + num2 + num3 + num4;
    }

    // Main method
    public static void main(String[] args) {
        // Call method sum with numbers 4, 3, 6, 1 and store result
        // in variable 'result'
        int result = sum(4, 3, 6, 1);
        // Print results
        System.out.println("Sum: " + result);
    }
}
