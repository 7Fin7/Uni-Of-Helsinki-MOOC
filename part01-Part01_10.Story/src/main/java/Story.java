// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Simple conversation with string concatenation
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}
