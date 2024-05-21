
/*
Define Match Class: Create a Match class to represent each match with 
attributes for home team, visiting team, home team points, and visiting 
team points.
 */

public class Match {
    // Instance variables to store match details
    private String homeTeam;  // Name of the home team
    private String awayTeam;  // Name of the away team
    private int homeTeamScore;  // Score of the home team
    private int awayTeamScore;  // Score of the away team
    
    // Constructor to initialise match attributes
    public Match(String homeTeam, String awayTeam, int homeTeamScore, int awayTeamScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }
    
    // Getter method for home team name
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    // Getter method for away team name
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    // Getter method for home team score
    public int getHomeTeamScore() {
        return this.homeTeamScore;
    }
    
    // Getter method for away team score
    public int getAwayTeamScore() {
        return this.awayTeamScore;
    }
}