
public class Money {

    // Instance variables to store euros and cents
    private final int euros;
    private final int cents;

    // Constructor to initialise euros and cents
    public Money(int euros, int cents) {

        // Adjust euros and cents if cents exceeds 99
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    // Getter method for euros
    public int euros() {
        return this.euros;
    }

    // Getter method for cents
    public int cents() {
        return this.cents;
    }
    
    // Method to add two Money objects
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        
        // Adjust euros and cents if cents exceeds 99
        if (newCents > 99) {
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }
           
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    // Method to check if current Money object is less than other Money object
    public boolean lessThan(Money compared) {        
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        
        return false;
    }

    // Method to subtract one Money object from another Money object 
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        
        // Adjust euros and cents if necessary
        if (newEuros >= 0) {
            
            if (newCents < 0) {
                newEuros -= 1;
                newCents += 100;
            }
        } else {
            // If result is negative, set euros and cents to 0
            newEuros = 0;
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    // Method to represent Money object as a string
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
