
public class FromParameterToOne {

    // Main method
    public static void main(String[] args) {
        // Call the printFromNumberToOne method with 5 as argument
        printFromNumberToOne(5);
    }
    
    // Method to print from number down to one
    public static void printFromNumberToOne(int number) {
        // Loop that initialises 'i' to the value of 'number' and
        // decrements '1' by one after each iteration
        for (int i = number; i > 0; i--) {
            // Print the current value of 'i'
            System.out.println(i);
        }
    }

}
