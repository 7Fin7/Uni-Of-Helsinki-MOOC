
import java.util.Scanner;

public class LastWords {

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

            // Split string by space and store in array
            String[] words = string.split(" ");
            
            // Print last word in array
            System.out.println(words[words.length - 1]);
        }
    }
}

