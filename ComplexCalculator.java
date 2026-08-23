// Class representing a Complex Number
class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition of two Complex Numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Display method
    public void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}

// Driver Class
public class ComplexCalculator {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4.5, 3.2);
        ComplexNumber c2 = new ComplexNumber(2.1, -1.7);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.display();
    }
}
