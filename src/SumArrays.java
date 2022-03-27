import java.util.Arrays;

public class SumArrays {
    public double sum(double[] numbers) {
        // if (numbers.length == 0) {
        //     return 0;
        // }

        // double solution = 0;

        // for (double d : numbers) {
        //     solution += d;
        // }

        // return solution;

        return (numbers.length > 0) ? Arrays.stream(numbers).sum() : 0;
    }
}
