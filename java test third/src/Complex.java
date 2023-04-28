import java.util.Scanner;
import java.util.Scanner;

public class Complex {
    private double realPart;      // 实部
    private double imaginaryPart; // 虚部

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex add(Complex c) {
        double real = this.realPart + c.realPart;
        double imaginary = this.imaginaryPart + c.imaginaryPart;
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex c) {
        double real = this.realPart - c.realPart;
        double imaginary = this.imaginaryPart - c.imaginaryPart;
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex c) {
        double real = this.realPart * c.realPart - this.imaginaryPart * c.imaginaryPart;
        double imaginary = this.realPart * c.imaginaryPart + this.imaginaryPart * c.realPart;
        return new Complex(real, imaginary);
    }

    public String toString() {
        return String.format("%.1f + %.1fi", realPart, imaginaryPart);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input c1:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.println("input c2:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        Complex c2 = new Complex(a, b);
        System.out.println("ComplexNumber a: " + c1);
        System.out.println("ComplexNumber b: " + c2);
        System.out.println("(a + b) = " + c1.add(c2));
        System.out.println("(a - b) = " + c1.subtract(c2));
        System.out.println("(a * b) = " + c1.multiply(c2));
        scanner.close();
    }
}
