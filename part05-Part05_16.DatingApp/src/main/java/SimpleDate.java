
public class SimpleDate {

    // Instance variables to store day, month, year
    private int day;
    private int month;
    private int year;

    // Constructor to initialise day, month, year
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to return a string representation of the date
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // Method to check if this date is before the specified date
    public boolean before(SimpleDate compared) {
        // Check year
        if (this.year < compared.year) {
            return true;
        }

        // Check month if the years are the same
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // Check day if months and years are the same
        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        // Return false if this date is not before the specified date
        return false;
    }

    // Method to advance the date by one day
    public void advance() {
        this.day++;
        
        // If day exceeds 30, increment month and adjust day
        if (this.day > 30) {
            this.month++;
            this.day = this.day - 30;
            
            // If month exceeds 12, increment year and adjust month
            if (this.month > 12) {
                this.year++;
                this.month = this.month - 12;
            }
        }        
    }
    
    // Method to advance the date by a specified number of days
    public void advance(int howManyDays) {
        this.day += howManyDays;
        
        // If day exeeds 30, increment month and adjust day
        if (this.day > 30) {
            this.month++;
            this.day = this.day - 30;
        }
        
        // If month exceeds 12, increment year and adjust month
        if (this.month > 12) {
                this.year++;
                this.month = this.month - 12;
        }
    }
    
    // Method to calculate a date after a specified numbers of days
    public SimpleDate afterNumberOfDays(int days) {
        // Create a new SimpleDate object with the same day, month, year
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        // Advance the new date by the specified number of days
        newDate.advance(days);
        // Return the new date
        return newDate;
    }
}
