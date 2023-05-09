import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<-------第一题------->");
        Monkey monkey = new Monkey("猴子");
        monkey.speak();
        People people = new People("人类");
        people.speak();
        people.think();//TODO:在此编写第一题测试代码
        System.out.println("<-------第二题------->");
        Vehicle vehicle = new Vehicle(4, 1000.0);
        vehicle.showInfo();
        Car car = new Car(4, 1200.0, 4);
        car.showInfo();
        Truck truck = new Truck(6, 5000.0, 2, 6000.0);
        truck.showInfo();//TODO:在此编写第二题测试代码
        System.out.println("<-------第三题------->");
        String a = "123456789012345678901234567890";
        String b = "987654321098765432109876543210";
        String c = getSum(a, b);
        System.out.println(c);//TODO:在此编写第三题测试代码
        System.out.println("<-------第四题------->");
        int m = 3, n = 7;
        int paths = uniquePaths(m, n);
        System.out.println(paths);
        //TODO:在此编写第四题测试代码
        System.out.println("<-------第五题------->");
        String[] strs = {"flower", "flow", "flight"};
        String p = longestCommonPrefix(strs);
        System.out.println(p);//TODO:在此编写第五题测试代码
    }
    //TODO:在此编写作业所需的方法
    //第三题格式要求 ,在TODO部分实现代码
    public static String getSum(String a, String b) {
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> lb = new ArrayList<Integer>();
        String c = "";

        // 将两个字符串转化为数字列表
        for (int i = a.length() - 1; i >= 0; i--) {
            la.add(a.charAt(i) - '0');
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            lb.add(b.charAt(i) - '0');
        }

        // 将数字列表补齐，使两个列表长度相等
        int len = Math.max(la.size(), lb.size());
        while (la.size() < len) {
            la.add(0);
        }
        while (lb.size() < len) {
            lb.add(0);
        }

        // 逐位相加，记录进位
        int carry = 0;
        for (int i = 0; i < len; i++) {
            int sum = la.get(i) + lb.get(i) + carry;
            carry = sum / 10;
            c = (sum % 10) + c;
        }

        // 处理最高位的进位
        if (carry > 0) {
            c = carry + c;
        }

        return c;
    }


    //第四题格式要求
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }


    //第五题格式要求
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


}

         //TODO:在此处编写作业所需的类， 并在主类中测试这些类
         //注意相互间的继承关系
          class Monkey {
             String name;

             public Monkey(String s) {
                 name = s;
             }

             public void speak() {
                 System.out.println("咿咿呀呀......");
             }
         }


 class People extends Monkey {

    public People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样儿，不错嘛！会说话了！");
    }

    public void think() {
        System.out.println("别说话！认真思考！");
    }
}


 class Vehicle {
    int wheels;
    double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println("车轮个数：" + wheels + "，车重：" + weight + "kg");
    }
}



 class Car extends Vehicle {
    int loader;
    int maxLoader = 5;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("核载人数：" + maxLoader + "，实际载人数：" + loader);
    }
}


 class Truck extends Vehicle {
    int loader;
    int maxLoader = 3;
    double payload;
    double maxPayload = 5000.0;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("核载人数：" + maxLoader + "，实际载人数：" + loader);
        System.out.println("核载重量：" + maxPayload + "kg，实际载重量：" + payload + "kg");
        if (payload > maxPayload) {
            System.out.println("超载了！");
        }
    }
}
