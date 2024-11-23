public class Circle {
    private double radius; // Private variable for encapsulation

    // Default constructor
    public Circle() {}

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method to get the radius
    public double getRadius() {
        return this.radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
