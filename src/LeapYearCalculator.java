public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        // // Parameter needs to be in a certain range...
        // if (year >= 1 && year <= 9999) {
        //     // Calculate if the year is a leap year - return true or false
        //     if (year % 4 == 0) {
        //         // Step 2
        //         if (year % 100 == 0) {
        //             // Step 3
        //             if (year % 400 == 0) {
        //                 // Step 4
        //                 return true; // is a leap year (has 366 days)
        //             } else {
        //                 // Step 5
        //                 return false; // not a leap year (has 365 days)
        //             }
        //         } else {
        //             // Step 4
        //             return true;
        //         }
        //     } else {
        //         // Step 5
        //         return false;
        //     }
        // } else {
        //     return false;
        // }

        // REFACTOR
        if (year >= 1 && year <= 9999) { // does the year fit within the given range
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true; // is leap year
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            }
        }

        return false;
    }
}