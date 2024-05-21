
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        // Infinite loop to continuously print and advance the timer
        while (true) {
            System.out.println(timer);  // Print the current time
            timer.advance();  // Advance the timer by 0.01 seconds

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }
}
