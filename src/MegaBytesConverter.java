public class MegaBytesConverter {
    public void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Check if invalid
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Calculate megabytes
            int mB = Math.round(kiloBytes / 1024);
            System.out.println(mB);
            
            // Calculate remaining kilobytes

            // Print message in the proper format
        }
    }
}
