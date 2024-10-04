
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store usernames and passwords
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        // Prompt and input username
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        // Prompt and enter password
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        // Flag to check if login is successful
        boolean isLoggedIn = false;
        
        // Iterate over the arrays to check for a match
        for (int i = 0; i < usernames.length; i++) {
            // Check if user input is in lists and print if successful
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                System.out.println("You have successfully logged in");
                
                // Set the flag to true if the login is successful
                isLoggedIn = true;
                
                break;  // Exit the loop if credentials are found
            }
        }
        
        // If no match is found, print an error message
        if (!isLoggedIn) {
            System.out.println("Incorrect username or password!");
        }
    }
}
