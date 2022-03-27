import java.util.PrimitiveIterator.OfDouble;

public class Main {
    public static void main(String[] args) {
        double[] myArray = {2.3, -5, 4.25, 66};
        SumArrays mySum = new SumArrays();
        System.out.println(mySum.sum(myArray));
    }
}
