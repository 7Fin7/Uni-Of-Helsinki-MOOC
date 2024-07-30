// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and input points
        System.out.println("Give points [0-100]");
        int points = Integer.valueOf(scan.nextLine());
        
        // Check if the points are greater than 100
        if (points > 100) {
            // If points are greater than 100, print "incredible!"
            System.out.println("incredible!");
        } else if (points >= 90) {
            // If points are between 90 and 100 (inclusive), print "Grade: 5"
            System.out.println("Grade: 5");
        } else if (points >= 80) {
            // If points are between 80 and 89 (inclusive), print "Grade: 4"
            System.out.println("Grade: 4");
        } else if (points >= 70) {
            // If points are between 70 and 79 (inclusive), print "Grade: 3"
            System.out.println("Grade: 3");
        } else if (points >= 60) {
            // If points are between 60 and 69 (inclusive), print "Grade: 2"
            System.out.println("Grade: 2");
        } else if (points >= 50) {
            // If points are between 50 and 59 (inclusive), print "Grade: 1"
            System.out.println("Grade: 1");
        } else if (points >= 0) {
            // If points are between 0 and 49 (inclusive), print "failed"
            System.out.println("failed");
        } else {
            // If points are less than 0, print "impossible!"
            System.out.println("impossible!");
        }
    }
}
