import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    // Method to compute factorial using BigInteger
    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE; // Initialize to 1

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Compute and display factorial
        System.out.println("Factorial of " + num + " is: ");
        System.out.println(calculateFactorial(num));
    }
}
