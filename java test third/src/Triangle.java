import java.util.Scanner;
public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public void setSide(double x, double y, double z) {
        if (x + y <= z || x + z <= y || y + z <= x) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        } else {
            this.a = x;
            this.b = y;
            this.c = z;
        }
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Triangle t = new Triangle(a, b, c);
        System.out.printf("perimeter=%.1f\n", t.getPerimeter());
        System.out.printf("area=%.1f\n", t.getArea());
        System.out.printf("a=%.1f,b=%.1f,c=%.1f\n", t.a, t.b, t.c);

        scanner.close();
    }
}
