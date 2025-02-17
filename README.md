Ans to the ques no:1 
function for reverse array

public class ReverseArray {
    // Method to reverse the array in place
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Sample array
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        // Printing original array with commas
        System.out.print("\nOriginal array:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");  // Add comma except for the last element
            }
        }

        // Reverse the array
        reverse(arr);

        // Printing reversed array with commas
        System.out.print("\n\nReversed array:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");  // Add comma except for the last element
            }
        }

        System.out.println("\n"); // Extra newline for clean output
    }
}
output:
Original array:
5.8, 2.6, 9.0, 3.4, 7.1

Reversed array:
7.1, 3.4, 9.0, 2.6, 5.8




Ans to the qs no.3:
import java.util.Scanner;

public class CGPACalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Student Information
        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("Enter Number of Courses: ");
        int numCourses = sc.nextInt();

        int totalCredits = 0;
        int totalEarnedCredits = 0;
        double weightedGradePoints = 0.0;

        // Iterate through courses
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            System.out.print("Enter Credit (Max 3): ");
            int credit = sc.nextInt();

            System.out.print("Enter CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("Enter AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("Enter FE (Max 60): ");
            int fe = sc.nextInt();

            int totalMarks = ct + at + fe;
            double gradePoint = calculateGradePoint(totalMarks);
            boolean passed = totalMarks >= 40;

            totalCredits += credit;
            if (passed) {
                totalEarnedCredits += credit;
                weightedGradePoints += gradePoint * credit;
            }
        }

        // Calculate CGPA
        double cgpa = totalEarnedCredits > 0 ? weightedGradePoints / totalCredits : 0;

        // Determine Grade
        String grade = calculateGrade(cgpa);

        // Output Results
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalEarnedCredits);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    // Method to calculate grade points based on marks
    private static double calculateGradePoint(int marks) {
        if (marks >= 85) return 4.0;
        else if (marks >= 70) return 3.5;
        else if (marks >= 60) return 3.0;
        else if (marks >= 50) return 2.5;
        else if (marks >= 40) return 2.0;
        else return 0.0;
    }

    // Method to determine grade based on CGPA
    private static String calculateGrade(double cgpa) {
        if (cgpa >= 3.7) return "A";
        else if (cgpa >= 3.3) return "A-";
        else if (cgpa >= 3.0) return "B+";
        else if (cgpa >= 2.7) return "B";
        else if (cgpa >= 2.3) return "B-";
        else if (cgpa >= 2.0) return "C+";
        else if (cgpa >= 1.7) return "C";
        else return "F";
    }
}
otput:
Student ID: it23055
Credit Taken: 9
Credit Earned: 9
CGPA: 4.00
Grade: A
Ans to the ques no:1
