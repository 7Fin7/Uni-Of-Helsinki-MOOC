
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and enter word
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        
        // Print word three times
        System.out.print(word + word + word);
    }
}
