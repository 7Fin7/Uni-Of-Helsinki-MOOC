
import java.util.ArrayList;

/*
The MatchAnalyser class provides methods to analyze match data stored 
in a list of Match objects. It offers functionality to calculate various 
statistics related to matches, such as the number of games played, wins, 
and losses for a given team.
 */
public class MatchAnalyser {
    
    // Method to calculate the number of games played by a given team
    public static int calculateGamesPlayed(ArrayList<Match> matches, String teamName) {
        int gamesPlayed = 0;
     
        // Iterate through the list of matches
        for (Match match: matches) {
            // Check if the team participated as either the home team or away team in the match
            if (match.getHomeTeam().equals(teamName) || match.getAwayTeam().equals(teamName)) {
                gamesPlayed++;
            }
        }
        return gamesPlayed;
    }
    
    // Method to calculate the number of wins acheived by a given team
    public static int calculateWins(ArrayList<Match> matches, String teamName) {      
        int wins = 0;
        
        // Iterate through the list of matches
        for (Match match: matches) {
            // Check if the team won the match based on the home and away team scores
            if (match.getHomeTeam().equals(teamName) && match.getHomeTeamScore() > match.getAwayTeamScore()) {
                wins++;
            } else if (match.getAwayTeam().equals(teamName) && match.getAwayTeamScore() > match.getHomeTeamScore()) {
                wins++;
            }
        }        
        return wins;
    }
    
    // Method to calculate the number of losses suffered by a given team
    public static int calculateLosses(ArrayList<Match> matches, String teamName) {        
        int losses = 0;
        
        // Iterate through the list of matches
        for (Match match: matches) {
            // Check if the team lost the match based on the home and away team scores
            if (match.getHomeTeam().equals(teamName) && match.getHomeTeamScore() < match.getAwayTeamScore()) {
                losses++;
            } else if (match.getAwayTeam().equals(teamName) && match.getAwayTeamScore() < match.getHomeTeamScore()) {
                losses++;
            }
        }
        
        return losses;
    }
}
