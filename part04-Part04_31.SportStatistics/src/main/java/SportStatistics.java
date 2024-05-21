
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    /*
    Implement Main Program: Write the main program to prompt the user for a 
    filename, read match statistics, prompt for a team name, and print the 
    requested data.
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt user for file name
        System.out.println("File?");
        String file = scan.nextLine();
        
        // Prompt user for the team name
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        // Read match records fom file
        ArrayList<Match> matches = readRecordsFromFile(file);
        
        // Calculate statistics for the specified team
        int gamesPlayer = MatchAnalyser.calculateGamesPlayed(matches, teamName);
        int wins = MatchAnalyser.calculateWins(matches, teamName);
        int losses = MatchAnalyser.calculateLosses(matches, teamName);
        
        // Print the results
        System.out.println("Games: " + gamesPlayer);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    /*
    Read Match Statistics from File: Implement a method to read match 
    statistics from the CSV file and store them in a list of Match objects.
    */
    public static ArrayList<Match> readRecordsFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();
        
        // Open a scanner to read from the specified file using try
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            
            // Read each line of the file
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                
                // Split the line into parts using comma as delimiter
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);
                
                // Create a Match object and add it to the list of matches
                matches.add(new Match(homeTeam, awayTeam, homeTeamScore, awayTeamScore));
            }
            
            
        } catch(Exception e) {
            // Print error message if an exception occurs
            System.out.println("Error: " + e.getMessage());
        }
        
        return matches;
    }
}
