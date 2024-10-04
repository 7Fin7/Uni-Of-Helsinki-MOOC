
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Create ArrayList to store numbers
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        // Call method on strings list
        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    // Method to remove last item in list
    public static void removeLast(ArrayList<String> strings) {
        // Check if list is empty and if so return nothing
        if (strings.size() == 0) {
            return;
        }
        
        // Otherwise, remove last item in list
        strings.remove(strings.size() - 1);
    }
}
