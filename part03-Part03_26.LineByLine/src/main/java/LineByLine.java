
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Infinite loop
        while (true) {
            // Input string
            String string = scanner.nextLine();
            
            // Check if the string is empty
            if (string.isEmpty()) {
                break;  // Exit the loop if the input is empty
            }
            
            // Split the words by space and call printWords
            String[] words = string.split(" ");
            printWords(words);
        }
    }
    
    // Method to print words in array
    public static void printWords(String[] words) {
        // Loop through array and print words
        for (String word: words) {
            System.out.println(word);
        }
    }
}