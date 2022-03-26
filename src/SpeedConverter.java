public class SpeedConverter {
    
    public long toMilesPerHour(double kilometersPerHour) {
        // Initial test
        if (kilometersPerHour < 0) {
            return -1; // indicates an invalid value
        }

        // Multiply the number of kilometers by 0.62137
        double miles = kilometersPerHour * 0.62137;

        // Round value
        long milesRounded = Math.round(miles);

        // Return as type long
        return milesRounded;
    }
}
