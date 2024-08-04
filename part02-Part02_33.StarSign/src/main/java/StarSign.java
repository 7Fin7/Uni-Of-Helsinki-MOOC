
public class StarSign {

    // Main method
    public static void main(String[] args) {
        
        // Testing methods
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    // Method prints the given number of stars and a line break
    public static void printStars(int number) {
        // Loop from 'i' up to 'number'
        for(int i = 0; i < number; i++) {
            // Print *
            System.out.print("*");
        }
        // Line break
        System.out.println("");
    }

    // Method prints a square with printStars method
    public static void printSquare(int size) {
        // Loop from 'i' to 'size'
        for (int i = 0; i < size; i++) {
            // Call printStars method with 'size' as parameter
            printStars(size);
        }
    }

    // Method prints rectangle using printStars method
    public static void printRectangle(int width, int height) {
        // Loop from 'i' to 'height'
        for (int i = 0; i < height; i++) {
            // Call printStars method with 'width' as parameter
            printStars(width);
        }
    }

    // Method prints a triangle using printStars method
    public static void printTriangle(int size) {
        // Loop from 'i' to 'size', inclusive
        for (int i = 1; i <= size; i++) {
            // Call printStars method with 'i' as parameter
            printStars(i);
        }
    }
}
