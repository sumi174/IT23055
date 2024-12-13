import java.util.Scanner;

public class MainClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. SumClass
        SumClass sumClass = new SumClass();
        double sum = sumClass.calculateSum();
        System.out.println("Calculated Sum (1 + 0.9 + ... + 0.1): " + sum);

        // 2. DivisorMultipleClass
        DivisorMultipleClass dmClass = new DivisorMultipleClass();
        System.out.print("Enter two integers to calculate GCD and LCM:\nFirst number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        int gcd = dmClass.gcd(num1, num2);
        int lcm = dmClass.lcm(num1, num2);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        // 3. NumberConversionClass
        NumberConversionClass conversionClass = new NumberConversionClass();

        // Decimal Conversion
        System.out.print("Enter a Decimal number: ");
        int decimal = scanner.nextInt();
        conversionClass.convertFromDecimal(decimal);

        // Binary Conversion
        System.out.print("Enter a Binary number: ");
        String binary = scanner.next();
        conversionClass.convertFromBinary(binary);

        // Octal Conversion
        System.out.print("Enter an Octal number: ");
        String octal = scanner.next();
        conversionClass.convertFromOctal(octal);

        // Hexadecimal Conversion
        System.out.print("Enter a Hexadecimal number: ");
        String hexadecimal = scanner.next();
        conversionClass.convertFromHexadecimal(hexadecimal);

        scanner.close();
    }
}
