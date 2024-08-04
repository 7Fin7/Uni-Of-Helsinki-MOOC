
public class FromOneToParameter {

    // Main method
    public static void main(String[] args) {
        // Call method printUntilNumber with 5 as the argument
        printUntilNumber(5);
    }
    
    // Method to print until a certain number
    public static void printUntilNumber(int number) {
        // Loop from 1 to the value of the parameter 'number', inclusive
        for (int i = 1; i <= number; i++) {
            // Print current value of 'i'
            System.out.println(i);
        }
    }

}
