class Excercise09 {
    public static void main(String[] args) {
        // Given data
        double initialSpeedKmph = 40.0; // Initial speed in kilometers per hour
        double initialTimeHours = 6.0; // Initial time taken in hours
        double targetTimeHours = 5.0; // Target time to cover the same distance in hours

        // Calculate the initial distance covered (d = v * t)
        double initialDistanceKm = initialSpeedKmph * initialTimeHours;

        // Calculate the required speed to cover the same distance in 5 hours (v = d / t)
        double requiredSpeedKmph = initialDistanceKm / targetTimeHours;

		// Display the result
        System.out.printf("The train should maintain a speed of %.2f km/h to cover the same distance in 5 hours.%n",
                requiredSpeedKmph);
    }
}

