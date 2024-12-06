import java.util.Scanner;

public class Factorion_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the range from the user
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        System.out.println("Factorion numbers in the range [" + start + ", " + end + "]:");

        // Iterate through the range
        for (int i = start; i <= end; i++) {
            // Create an object of Factorion
            Factorion factorion = new Factorion();

            // Set the number using the setter
            factorion.setNumber(i);

            // Check if the number is a factorion
            if (factorion.isFactorion()) {
                System.out.println(i);
            }
        }

        // Close the scanner
        sc.close();
    }
}
