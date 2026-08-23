import java.util.Scanner;

// Base class: accepts radius
class Radius {
    protected double radius;

    public void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
}

// First derived class: finds area of circle
class Circle extends Radius {
    protected double area;

    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

// Second derived class: finds volume of sphere
class Sphere extends Circle {
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);
    }
}

// Driver class
public class VolumeCalculator {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.getRadius();        // from base class
        sphere.calculateArea();    // from Circle class
        sphere.calculateVolume();  // from Sphere class
    }
}
