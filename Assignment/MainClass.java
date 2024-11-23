import java.util.Scanner; 

public class MainClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Create an object of the Circle class
        Circle circle = new Circle();

        // Set the radius using the setter method
        circle.setRadius(radius);

        // Display the radius and calculate the area
        System.out.println("The radius of the circle is: " + circle.getRadius());
        System.out.println("The area of the circle is: " + circle.computeArea());

        // Close the scanner
        sc.close();
    }
}
