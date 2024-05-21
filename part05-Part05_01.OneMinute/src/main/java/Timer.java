/*
This class represents a timer with two clock hands: one for hundredths 
of a second and one for seconds. It provides methods to advance the timer 
by one hundredth of a second and to represent the timer as a string in the 
format "seconds:hundredths".
 */

public class Timer {
    
    // Instance variables to represent the hundredths and seconds hands of
    // the timer
    private ClockHand hundredths;
    private ClockHand seconds;
    
    // Constructor to initialise the timer with hundredths and seconds hands
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    // Method to advance the timer by one hundredth of a second
    public void advance() {
        // Advance the hundredths hand
        this.hundredths.advance();
        
        // If the hundredths hand resets to 0, advance the seconds hand
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
            
            // If the seconds hand reaches 60, reset it to 0
            if (this.seconds.value() == 0) {
                this.seconds = new ClockHand(60);
            }
        }
    }
    
    // Method to represent the timer as a string in the format:
    // "seconds:hundredths"
    @Override
    public String toString() {
        return seconds + ":" + hundredths;
    }
}
