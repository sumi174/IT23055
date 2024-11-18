public class AverageSpeed {
    public static void main(String[] args) {
        double distanceInKilometers = 14;
        int minutes = 45;
        int seconds = 30;

        // Convert total time to hours
        double totalTimeInHours = (minutes * 60 + seconds) / 3600.0;

        // Convert kilometers to miles
        double distanceInMiles = distanceInKilometers / 1.6;

        // Calculate average speed in miles per hour
        double averageSpeed = distanceInMiles / totalTimeInHours;

        System.out.println("Average speed in miles per hour: " + averageSpeed);
    }
}
