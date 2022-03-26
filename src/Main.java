public class Main {
    public static void main(String[] args) {
        SpeedConverter mySpeed = new SpeedConverter();
        System.out.println(mySpeed.toMilesPerHour(95.75));
        mySpeed.printConversion(95.75);
    }
}
