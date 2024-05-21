/*
This class represents a clock hand, such as hours, minutes, or seconds, 
with methods to advance it by one unit, retrieve its current value, and 
represent it as a string with leading zeros if necessary.
*/


public class ClockHand {

    // Instance variables to store the current value of the clock hand and
    // its limit
    private int value;
    private int limit;

    // Constructor to initialise the ClockHand with a specified limit
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    // Method to advance the clock hand by one unit
    public void advance() {
        this.value = this.value + 1;

        // If the value exceeds the limit, reset it to 0
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    // Method to get the current value of the clock hand
    public int value() {
        return this.value;
    }

    // Method to represent the clock hand as a string
    public String toString() {
        // If the value is less than 10, add a leading zero before
        // converting to string
        if (this.value < 10) {
            return "0" + this.value;
        }

        // Otherwise, simply convert the value to string
        return "" + this.value;
    }
}