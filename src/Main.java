public class Main {
    public static void main(String[] args) {
        SpeedConverter mySpeed = new SpeedConverter();
        System.out.println(mySpeed.toMilesPerHour(10.25));
        mySpeed.printConversion(75.114);
    }
}
