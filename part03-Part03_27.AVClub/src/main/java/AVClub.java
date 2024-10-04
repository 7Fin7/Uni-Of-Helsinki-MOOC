
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Infinite loop
        while (true) {
            // Input string
            String string = scanner.nextLine();
            
            // Check if string is empty and break loop
            if (string.isEmpty()) {
                break;
            }
            
            // Split the string by spaces and store in array
            String[] words = string.split(" ");
            // Call containsLetters on array with string 'av'
            containsLetters(words, "av");
        }
    }
    
    // Check if array elements include substring
    public static void containsLetters(String[] words, String letters) {
        // Loop through array
        for (String word: words) {
            // Check if word contains letters if so print word
            if (word.contains(letters)) {
                System.out.println(word);
            }
        }
    }
}
