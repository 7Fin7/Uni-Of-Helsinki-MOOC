// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input number
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        
        // If num equals 1984 print "Orwell"
        if (num == 1984) {
            System.out.println("Orwell");
        }
    }
}
