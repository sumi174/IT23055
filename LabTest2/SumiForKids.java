import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SumiForKids {
    public static void main(String[] args) {
        // File names
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        // Initialize scores
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Math Quiz for Kids!");
        
        // Get player name
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();

        // Ask to play
        System.out.print("Would you like to play? (yes/no): ");
        String startQuiz = scanner.nextLine().toLowerCase();
        if (!startQuiz.equals("yes")) {
            System.out.println("Maybe next time! Goodbye.");
            return;
        }

        // Select difficulty level
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Beginner (5 questions)");
        System.out.println("2. Intermediate (10 questions)");
        System.out.println("3. Hard (20 questions)");
        System.out.print("Your choice (1/2/3): ");
        int difficultyChoice = scanner.nextInt();
        int totalQuestions;
        String difficulty;

        switch (difficultyChoice) {
            case 1:
                totalQuestions = 5;
                difficulty = "Beginner";
                break;
            case 2:
                totalQuestions = 10;
                difficulty = "Intermediate";
                break;
            case 3:
                totalQuestions = 20;
                difficulty = "Hard";
                break;
            default:
                totalQuestions = 5;
                difficulty = "Beginner";
                System.out.println("Invalid choice. Defaulting to Beginner.");
                break;
        }

        // Process quiz questions
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int questionCount = 0;

            while ((line = reader.readLine()) != null && questionCount < totalQuestions) {
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    System.out.println("Invalid format in question: " + line);
                    continue;
                }

                String question = parts[0].trim();
                int correctAnswer = Integer.parseInt(parts[1].trim());

                // Ask user to solve the math expression
                System.out.println("What is the result of: " + question);
                int userAnswer = scanner.nextInt();
                int expectedAnswer = evaluateExpression(question);

                if (userAnswer == expectedAnswer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect! The correct answer is: " + expectedAnswer);
                    incorrectAnswers++;
                }
                questionCount++;
            }

            // End of quiz
            System.out.println("\nQuiz Over!");
            System.out.println("Your score: " + correctAnswers + "/" + totalQuestions);
            System.out.println("Correct answers: " + correctAnswers);
            System.out.println("Incorrect answers: " + incorrectAnswers);

            // Record the result with timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
                // Add header if file is empty
                File file = new File(outputFile);
                if (file.length() == 0) {
                    writer.write(String.format("%-20s %-10s %-20s %-15s%n", "Player", "Score", "Date & Time", "Difficulty"));
                }
                writer.write(String.format("%-20s %-10s %-20s %-15s%n", playerName, correctAnswers + "/" + totalQuestions, timestamp, difficulty));
            }

        } catch (IOException e) {
            System.out.println("Error while reading the input file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the question file.");
        }
    }

    // Helper method to calculate the answer to a math expression
    private static int evaluateExpression(String expression) {
        int result = 0;
        if (expression.contains("+")) {
            String[] operands = expression.split("\\+");
            result = Integer.parseInt(operands[0].trim()) + Integer.parseInt(operands[1].trim());
        } else if (expression.contains("-")) {
            String[] operands = expression.split("-");
            result = Integer.parseInt(operands[0].trim()) - Integer.parseInt(operands[1].trim());
        } else if (expression.contains("*")) {
            String[] operands = expression.split("\\*");
            result = Integer.parseInt(operands[0].trim()) * Integer.parseInt(operands[1].trim());
        } else if (expression.contains("/")) {
            String[] operands = expression.split("/");
            result = Integer.parseInt(operands[0].trim()) / Integer.parseInt(operands[1].trim());
        }
        return result;
    }
}
