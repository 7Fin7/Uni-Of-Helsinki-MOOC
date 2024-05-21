
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String string = scanner.nextLine();
            
            if (string.isEmpty()) {
                break;
            }
            
            String[] words = string.split(" ");
            containsLetters(words, "av");
        }
    }
    
    public static void containsLetters(String[] words, String letters) {
        for (String word: words) {
            if (word.contains(letters)) {
                System.out.println(word);
            }
        }
    }
}
