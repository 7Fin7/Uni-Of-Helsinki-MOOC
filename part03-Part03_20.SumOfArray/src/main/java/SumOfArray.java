
public class SumOfArray {

    public static void main(String[] args) {
        // Create array and test method
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    // Method to calculate sum of an array
    public static int sumOfNumbersInArray(int[] array) {
        // Initialise index and sum
        int index = 0;
        int sum = 0;
        
        // Loop through array and add element to sum
        while (index < array.length) {
            sum += array[index];
            index += 1;
        }
        return sum;
    }
}
