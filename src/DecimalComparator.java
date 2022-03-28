public class DecimalComparator {
    public boolean areEqualByThreeDecimalPlaces(double x, double y) {
        // Convert double to int
        // Multiplying the ints by 1000 moves the decimals to the right by 3 places
        int newX = (int)(x * 1000);
        int newY = (int)(y * 1000);

        // Return true if two double numbers are the same by up to 3 decimal places
        return newX == newY;
    }
}
