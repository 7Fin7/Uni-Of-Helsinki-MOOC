
public class Item {
    
    // Instance variables to store identifier and the name of the item
    private String identifier;
    private String name;
    
    // Constructor to initialise the item with idenfier and name
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    // Override the equals method to compare items for equality
    @Override
    public boolean equals(Object compared) {
        // if the references are the same, they are equal
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not of type Item, objects not equal
        if (!(compared instanceof Item)) {
            return false;
        }
        
        // convert the object to an Item object
        Item comparedItem = (Item) compared;
        
        // if the values of the object variables are equal, objects equal
        return this.identifier.equals(comparedItem.identifier);
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
