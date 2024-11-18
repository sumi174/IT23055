public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        double distanceInMiles = 24; // Distance in miles
        int hours = 1;              // Hours
        int minutes = 40;           // Minutes
        int seconds = 35;           // Seconds

        // Convert total time to hours
        double totalTimeInHours = hours + (minutes * 60 + seconds) / 3600.0;

        // Convert miles to kilometers
        double distanceInKilometers = distanceInMiles * 1.6;

        // Calculate average speed in kilometers per hour
        double averageSpeed = distanceInKilometers / totalTimeInHours;

        System.out.println("Average speed in kilometers per hour: " + averageSpeed);
    }
}
