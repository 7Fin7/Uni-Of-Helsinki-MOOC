
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and input string
        System.out.println("Give a string:");
        String word = scanner.nextLine();
        
        // Check if string equals 'true' and if so print 'you got it right'
        if (word.equals("true")) {
            System.out.println("You go it right!");
        // Otherwise, print 'try again'
        } else {
            System.out.println("Try again!");
        }
    }
}
