// Scanner class for user input
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and input how many times to print text
        System.out.println("How many times?");
        int count = Integer.valueOf(scanner.nextLine());
        
        // Initialise i to 0
        int i = 0;
        
        // Loop while i is less than count
        while (i < count) {
            // Call the method printText
            printText();
            // Increment i by 1
            i++;
        }
    }
    
    public static void printText() {
        // Print text
        System.out.println("In a hole in the ground there lived a method");
    }
}
