import java.util.PrimitiveIterator.OfDouble;

public class Main {
    public static void main(String[] args) {
        double[] myArray = {25.5, 63.4, 78.2};
        SumArrays mySum = new SumArrays();
        System.out.println(mySum.sum(myArray));
    }
}
