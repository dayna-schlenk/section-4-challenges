public class SpeedConverter {
    
    public long toMilesPerHour(double kilometersPerHour) {
        // Initial test
        if (kilometersPerHour < 0) {
            return -1; // indicates an invalid value
        } else {
            // Divide the number of kilometers by 1.609
            double miles = kilometersPerHour / 1.609;

            // Round value
            long milesRounded = Math.round(miles);

            // Return as type long
            return milesRounded;
        }
    }

    public void printConversion(double kilometersPerHour) {
        // Testing for invalid value
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            // Calculate milesPerHour from the kilometersPerHour parameter
            long getMiles = toMilesPerHour(kilometersPerHour);

            // Print message
            System.out.println(kilometersPerHour + " km/h = " + getMiles + " mi/h");
        }
    }
}
