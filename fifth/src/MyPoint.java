import java.util.Scanner;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void display() {
        System.out.println("Your location of horizontal (X) is :" + x);
        System.out.println("Your location of ordinate (Y) is :" + y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the horizontal (X) : ");
        double x = input.nextDouble();

        System.out.println("Please input the ordinate (Y) : ");
        double y = input.nextDouble();

        MyPoint point = new MyPoint(x, y);
        point.display();
    }
}
