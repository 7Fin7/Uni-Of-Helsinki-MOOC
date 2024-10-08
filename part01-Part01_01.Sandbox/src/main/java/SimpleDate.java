
public class SimpleDate {
    
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // used to check if this date object ('this') is before
    // the date object given as the parameter ('compared')
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
        
        if (this.year > compared.year) {
            return false;
        }
        
        // years are the same, compare months
        if (this.month < compared.month) {
            return true;
        }
        
        if (this.month > compared.month) {
            return false;
        }
        
        // years and months are same, compare days
        if (this.day < compared.day) {
            return true;
        }
        
        return false;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
