
public class AdvancedAstrology {

    // Method prints the given number of stars and a line break
    public static void printStars(int number) {
        // Loop from 'i' up to 'number'
        for(int i = 0; i < number; i++) {
            // Print a single star without a newline
            System.out.print("*");
        }
        // Print a newline after printing all stars
        System.out.println("");
    }

    // Method produces number of spaces specified by 'number'
    public static void printSpaces(int number) {
        // Initialise an empty string to accumulate spaces
        String spaces = "";
        // Loop from 0 up to the specified number
        for (int i = 0; i < number; i++) {
            // Append a single space to the spaces string
            spaces += " ";
        }
        // Print all accumulated spaces in one line
        System.out.print(spaces);
    }

    // Method uses printSpaces and printStars to print triangle
    public static void printTriangle(int size) {
        // Initialize counter 'i' to 1 (the first line should have 1 star)
        int i = 1;
        // Loop through each level of the triangle from 1 up to the given size
        while (i <= size) {
            // Print spaces for left padding to center the stars
            printSpaces(size - i);
            // Print stars for the current level
            printStars(i);
            // Move to the next line
            i++;
        }
    }

    // Method to print a Christmas tree pattern of stars
    public static void christmasTree(int height) {
        // Print the upper part of the Christmas tree
        int i = 1;
        while (i <= height) {
            // Print spaces to center the stars for the current level
            printSpaces(height - i);
            // Print stars for the current level, which is an odd number
            printStars(2 * i - 1);
            // Move to the next level
            i++;
        }
        
        // Print the trunk of the Christmas tree
        // Print spaces to centre the trunk
        printSpaces(height - 2);
        // Print trunk part 1
        printStars(3);
        // Print spaces again to center the trunk
        printSpaces(height - 2);
        // Print trunk part 2 (same as trunk part 1)
        printStars(3);
    }

    // Main method
    public static void main(String[] args) {
        
         // Test the printTriangle method with a size of 5
        printTriangle(5);
        System.out.println("---");
        
        // Test the christmasTree method with a height of 4
        christmasTree(4);
        System.out.println("---");
        
        // Test the christmasTree method with a height of 10
        christmasTree(10);
        
    }
}
