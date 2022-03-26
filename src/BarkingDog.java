public class BarkingDog {
    public boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // hourOfDay should have a valid range of 0-23
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            // Wake up if dog is barking before 7 or after 22 hours
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
