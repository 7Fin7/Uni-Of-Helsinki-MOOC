
public class Greatest {

    // Method to return greatest number of 3 choices
    public static int greatest(int number1, int number2, int number3) {
        // Check if number1 is greater than both number2 and number3
        if (number1 > number2 && number1 > number3) {
            return number1; // Return number1 if greatest
        } 
        // Check if number2 is greater than both number1 and number3
        else if (number2 > number1 && number2 > number3) {
            return number2; // Return number2 if greatest
        } 
        // If neither above conditions true, number3 is greatest
        else {
            return number3; // Return number3 as greatest
        }
    }

    // Main method
    public static void main(String[] args) {
        // Call greatest method with 3 numbers and store result
        int result = greatest(2, 7, 3);
        // Print results
        System.out.println("Greatest: " + result);
    }
}
