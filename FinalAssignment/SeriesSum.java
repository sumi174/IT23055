import java.io.*;
import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Read numbers from the input file
            Scanner scanner = new Scanner(new File(inputFile));
            scanner.useDelimiter(",");
            
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
            
            // Process numbers
            List<String> results = new ArrayList<>();
            for (int number : numbers) {
                int sum = sumNaturalNumbers(number);
                results.add(number + ", " + sum);
            }
            
            // Write results to the output file
            PrintWriter writer = new PrintWriter(new File(outputFile));
            for (String result : results) {
                writer.println(result);
            }
            writer.close();
            
            System.out.println("Processing complete. Check output.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
    // Method to calculate the sum of natural numbers up to n
    private static int sumNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
