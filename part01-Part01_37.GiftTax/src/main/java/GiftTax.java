// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scan
        Scanner scan = new Scanner(System.in);

        // Prompt and input value of gift
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        // Initialize a variable to hold the tax amount
        double tax;
        
        // Calculate the tax based on the value of the gift
        if (value >= 1_000_000) {
            // If the gift value is 1,000,000 or more, calculate the tax accordingly
            tax = 142_100 + (value - 1_000_000) * 0.17;
            System.out.println("Tax: " + tax);
        } else if (value >= 200_000) {
            // If the gift value is between 200,000 and 999,999, calculate the tax accordingly
            tax = 22_100 + (value - 200_000) * 0.15;
            System.out.println("Tax: " + tax);
        } else if (value >= 55_000) {
            // If the gift value is between 55,000 and 199,999, calculate the tax accordingly
            tax = 4_700 + (value - 55_000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (value >= 25_000) {
            // If the gift value is between 25,000 and 54,999, calculate the tax accordingly
            tax = 1_700 + (value - 25_000) * 0.1;
            System.out.println("Tax: " + tax);
        } else if (value >= 5_000) {
            // If the gift value is between 5,000 and 24,999, calculate the tax accordingly
            tax = 100 + (value - 5_000) * 0.08;
            System.out.println("Tax: " + tax);
        } else {
            // If the gift value is less than 5,000, no tax is applied
            System.out.println("No tax!");
        }
    }
}
