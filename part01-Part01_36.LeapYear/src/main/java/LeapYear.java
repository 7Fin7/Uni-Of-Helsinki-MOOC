// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scan
        Scanner scan = new Scanner(System.in);
        
        // Prompt and input year
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        
        // Check if the year is a leap year
        // A year is a leap year if it is divisible by 4 but not by 100, 
        // or if it is divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // If the year is a leap year, print a message indicating this
            System.out.println("The year is a leap year.");
        } else {
            // If the year is not a leap year, print a message indicating this
            System.out.println("The year is not a leap year.");
        }
    }
}
