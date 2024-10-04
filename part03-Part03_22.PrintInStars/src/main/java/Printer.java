
public class Printer {

    public static void main(String[] args) {
        // Create array and test method
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    // Method to print a row of stars for each number in array
    public static void printArrayInStars(int[] array) {
        // Loop through array
        for (int num: array) {
            // Loop from 0 to number in array and print '*'
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            // New line
            System.out.println("");
        }
    }

}
