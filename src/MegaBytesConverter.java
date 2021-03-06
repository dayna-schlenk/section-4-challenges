public class MegaBytesConverter {
    public void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Check if invalid
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Calculate megabytes
            int mB = Math.round(kiloBytes / 1024);
            
            // Calculate remaining kilobytes
            int remainingKB = Math.round(kiloBytes % 1024);

            // Print message in the proper format
            System.out.println(kiloBytes + " KB = " + mB + " MB and " + remainingKB + " KB");
        }
    }
}
