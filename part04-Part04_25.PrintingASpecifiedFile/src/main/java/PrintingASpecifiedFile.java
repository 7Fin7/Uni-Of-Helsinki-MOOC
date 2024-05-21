
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        
        // create a scanner for reading the file
        try (Scanner readingFile = new Scanner(Paths.get(file))) {
            
            // read the file until all lines have been read
            while (readingFile.hasNextLine()) {
                // read one line
                String row = readingFile.nextLine();
                // print the line
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
