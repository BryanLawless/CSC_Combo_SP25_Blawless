
import java.util.Scanner;

public class CircleCalculation {

    public static double calculateDiameter(double radius) {
        return 2 * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double diameter = calculateDiameter(radius);
            double circumference = calculateCircumference(radius);
            double area = calculateArea(radius);

            System.out.println("Diameter: " + diameter);
            System.out.println("Circumference: " + circumference);
            System.out.println("Area: " + area);
        }
    }
}
