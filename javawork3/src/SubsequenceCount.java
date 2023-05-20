import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<-------第一题------->");
        UseCompute useCompute = new UseCompute();

        int operand1 = 10;
        int operand2 = 5;

        Compute add = new Add();
        useCompute.useCom(add, operand1, operand2); // 加法运算

        Compute subtract = new Subtract();
        useCompute.useCom(subtract, operand1, operand2); // 减法运算

        Compute multiply = new Multiply();
        useCompute.useCom(multiply, operand1, operand2); // 乘法运算

        Compute divide = new Divide();
        useCompute.useCom(divide, operand1, operand2); // 除法运算
        System.out.println("<-------第二题------->");
        System.out.print("请输入分数：");
        int score = scanner.nextInt();

        try {
            ScoreChecker.checkScore(score);
        } catch (ScoreException e) {
            System.out.println("异常信息：" + e.getMessage());
        }
        System.out.println("<-------第三题------->");
        AverageCalculator s = new AverageCalculator();
        System.out.println("<-------第四题------->");
        MyDate birthday = new MyDate(2001, 5, 1);
        Employee employee = new SalariedEmployee("wan hua", "10086", birthday, 3000.0);
        System.out.println(employee.toString());
        System.out.println("Earnings: " + employee.earnings());
        System.out.println("<-------第五题------->");
        String S = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        int result = SubsequenceCount.countSubsequenceWords(S, words);
        System.out.println(result);
    }
}
//1
interface Compute {
    int computer(int n, int m);
}

// 加法类
class Add implements Compute {
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}

// 减法类
class Subtract implements Compute {
    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}

// 乘法类
class Multiply implements Compute {
    @Override
    public int computer(int n, int m) {
        return n * m;
    }
}

// 除法类
class Divide implements Compute {
    @Override
    public int computer(int n, int m) {
        if (m != 0) {
            return n / m;
        } else {
            throw new ArithmeticException("除数不能为0");
        }
    }
}

// 使用Compute接口的类
class UseCompute {
    public void useCom(Compute com, int one, int two) {
        int result = com.computer(one, two);
        System.out.println("运算结果: " + result);
    }
}
//2
class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}

class ScoreChecker {
    public static void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("分数必须在0—100之间");
        } else {
            System.out.println("成绩：" + score);
        }
    }
}

//第三题
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
class AverageCalculator {
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数个数 N：");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("请输入第 " + (i + 1) + " 个整数：");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("必须是正数或者0");
                }

                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println("异常信息：" + e.getMessage());
                i--; // 重新输入负数
            }
        }

        double average = (double) sum / count;
        System.out.println("平均值：" + average);
    }
}
//第四题

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 省略getter和setter方法

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Employee类
abstract class Employee {
    private String name;
    private String number;
    private MyDate birthday;

    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    // 抽象方法earnings()
    public abstract double earnings();

    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number + ", Birthday: " + birthday.toString();
    }
}

// 具体的Employee子类示例
class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }
}
//5

 class SubsequenceCount {
    public static int countSubsequenceWords(String S, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, S)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSubsequence(String word, String sequence) {
        int i = 0;
        for (char c : word.toCharArray()) {
            if (i >= sequence.length()) {
                return false;
            }
            if (c == sequence.charAt(i)) {
                i++;
            }
        }
        return true;
    }
}



