// Scanner class for user input
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input number to be squared
        int num = Integer.valueOf(scanner.next());
        
        // Calculate the sqaure of the number and print result
        System.out.println(num*num);
    }
}
