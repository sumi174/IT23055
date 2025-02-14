import java.util.Scanner;

public class RootFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.print("Enter coefficients a, b, and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculating the discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            // Finding the smallest positive root using Math.min()
            if (root1 > 0 && root2 > 0) {
                System.out.println("The smallest positive root is: " + Math.min(root1, root2));
            } else if (root1 > 0) {
                System.out.println("The smallest positive root is: " + root1);
            } else if (root2 > 0) {
                System.out.println("The smallest positive root is: " + root2);
            } else {
                System.out.println("No positive real roots.");
            }
        }

        sc.close();
    }
}
