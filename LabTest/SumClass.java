public class SumClass {
    public double calculateSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.01; i -= 0.1) {
            sum += i;
        }
        return sum;
    }
}
