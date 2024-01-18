package Java.Numbers;

/**
 * FindPIToTheNthDigit
 */
public class FindPIToTheNthDigit {

    public static double findPI(long n) {
        double pi = 3;
        double denominator = 1.0;  // Initialize denominator as double
        for (int i = 2; i <= n; i += 2) {
            denominator *= (2 * i) * (2 * i + 1);  // Calculate denominator accurately
            pi += 4.0 / denominator;
            denominator *= (2 * i + 2) * (2 * i + 3);
            pi -= 4.0 / denominator;
        }
        return pi;
    }

    public static void main(String[] args) {
        long n = 1000000000;
        System.out.println(findPI(n));
    }
}
