
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // User input
            String string = scanner.nextLine();
            // Check if the string is empty
            if (string.isEmpty()) {
                break;  // Exit the loop if the input is empty
            }
            // Split the words by space
            String[] words = string.split(" ");
            printWords(words);
        }
    }
    
    public static void printWords(String[] words) {
        for (String word: words) {
            System.out.println(word);
        }
    }
}