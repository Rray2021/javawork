
public class TestHuman {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Man m = new Man();
        m.setName("Dave");
        m.setAge(28);
        m.setSex("man");
        m.getInfo();
        m.speak();
        m.run();
        Human h = new Woman();
        h.setName("Jude");
        h.setAge(58);
        h.setSex("woman");
        h.getInfo();
        h.speak();
        h.run();
    }
}

class Human {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void speak() {//根据输出结果倒推，需要在子类进行方法覆写
        System.out.println("I am a human.");
    }

    public void run() {//根据输出结果倒推，需要在子类进行方法覆写
        System.out.println("I can run.");
    }

    public void getInfo() {
        System.out.println("my name is:" + getName());
        System.out.println("my age is:" + getAge());
        System.out.println("my sex is:" + getSex());
    }
}

class Man extends Human  {//自己编写部分
    public void speak() {//进行方法覆写
        System.out.println("I am a man.");
    }

    public void run() {//进行方法覆写
        System.out.println("I am a strong man.");
    }
}

class Woman extends Human  {//自己编写部分
    public void speak() {//进行方法覆写
        System.out.println("I am a woman.");
    }

    public void run() {//进行方法覆写
        System.out.println("I am a beautiful woman.");
    }
}
