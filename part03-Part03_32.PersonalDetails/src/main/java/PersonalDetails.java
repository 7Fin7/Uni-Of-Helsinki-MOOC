
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;  // variable to store sum of birth years
        int count = 0;  // variable to count number of entries
        String longestName = "";  // variable to store the longest name
        
        // loop to read input until an empty line is entered
        while (true) {
            String input = scanner.nextLine();
            
            // break out of the loop if the input is empty
            if (input.isEmpty()) {
                break;
            }
            
            // split the input into name and birth year using comma
            String[] parts = input.split(",");
            String name = parts[0];  // extract the name
            int birthYear = Integer.parseInt(parts[1]);  // extract the birth year
            
            // update the longestName variable if current is longer
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            // update sum and count variables
            sum += birthYear;
            count += 1;
        }
        
        // calculate the average birth year
        double averageYear = (double) sum / count;
        // print the results
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYear);
    }
}
