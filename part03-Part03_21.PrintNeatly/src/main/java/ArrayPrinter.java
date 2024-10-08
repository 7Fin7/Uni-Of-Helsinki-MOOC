
public class ArrayPrinter {

    public static void main(String[] args) {
        // Create array and test method
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    // Method to print numbers in an array
    public static void printNeatly(int[] array) {
        // Loop through items in array - 1 and print in specified format
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        // Print last item without an ending comma
        System.out.print(array[array.length - 1]);
    }
}
