

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialise array of size 10
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Prompt and input search value
        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Initialize a boolean variable to track whether the element is found
        boolean found = false;
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the value being searched for
            if (array[i] == searching) {
                 // If found, print the index where it was found and set found to true
                System.out.println(searching + " is at index " + i + ".");
                found = true;
                // Exit the loop once the element is found
                break;
            }
        }
         // Check if the element was not found and print a message accordingly
        if (!found) {
            System.out.println(searching + " was not found.");
        }
    }

}
