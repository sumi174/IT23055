public class Factorion {
    private int number; // Private variable for encapsulation

    // Default constructor
    public Factorion() {}

    // Constructor with number parameter
    public Factorion(int number) {
        this.number = number;
    }

    // Setter method to set the number
    public void setNumber(int number) {
        this.number = number;
    }

    // Getter method to get the number
    public int getNumber() {
        return this.number;
    }

    // Method to calculate the factorial of a digit
    private int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if the number is a factorion
    public boolean isFactorion() {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); // Calculate factorial of each digit
            temp /= 10;
        }

        return sum == number; // Return true if the sum equals the original number
    }
}
