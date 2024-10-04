
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Infinite loop
        while (true) {
            // Input string
            String string = scanner.nextLine();
            
            // If string is empty break
            if (string.isEmpty()) {
                break;
            }

            // Split string by spaces and store in array
            String[] words = string.split(" ");
            
            // Print the first word in array
            System.out.println(words[0]);
        }
    }
}
