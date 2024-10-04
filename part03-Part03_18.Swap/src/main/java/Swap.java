
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialise array of size 5
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        // Initiailise index
        int index = 0;
        // Loop through array and print values
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Prompt and input indices to swap
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.next());
        int index2 = Integer.valueOf(scanner.next());
        
        // Store value at index1 in a temp variable
        int temp = array[index1];
        // Assign value at index2 to index1
        array[index1] = array[index2];
        // Assign temp value to index2
        array[index2] = temp;

        System.out.println("");
        
        // Set index to 0
        index = 0;
        // Loop through array and print values
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
