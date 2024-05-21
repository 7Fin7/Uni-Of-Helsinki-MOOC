
public class Main {

    public static void main(String[] args) {
        // Create a SimpleDate object representing February 13, 2015
        SimpleDate date = new SimpleDate(13, 2, 2015);
        // Print the initial date
        System.out.println("Friday of the examined week is " + date);

        // Calculate the date after 7 days and print it for the next 7 weeks
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }
    }
}
