import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double basicSalary;
    private double bonus;

    public Employee(String name, int age, double basicSalary, double bonus) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalIncome() {
        return basicSalary + bonus;
    }

    public void display() {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's income: " + getTotalIncome());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the employee's name: ");
        String name = input.nextLine();

        System.out.println("Please input the employee's age: ");
        int age = input.nextInt();

        System.out.println("Please input the employee's sarary: ");
        double basicSalary = input.nextDouble();

        System.out.println("Please input the employee's bonus: ");
        double bonus = input.nextDouble();

        Employee employee = new Employee(name, age, basicSalary, bonus);

        System.out.println("Employee's name: " + employee.getName());
        System.out.println("Employee's age: " + employee.getAge());
        System.out.println("Employee's income: " + employee.getTotalIncome());

    }
}
