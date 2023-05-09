
public class TestPeople {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChinaPeople chp = new ChinaPeople();
        chp.height = 180;
        chp.weight = 130;
        chp.speakHello();
        chp.averageHeight();
        chp.averageWeight();
        chp.chinaGongfu();
        AmericanPeople amp = new AmericanPeople();
        amp.setHeight(175);
        amp.setWeight(150);
        amp.speakHello();
        amp.averageHeight();
        amp.averageWeight();
        amp.amercianBoxing();
    }
}

class People {
    protected double height;
    protected double weight;

    public double getHeight()  {
        return height;
    }

    public void setHeight(double height)  {
        this.height = height;
    }

    public double getWeight()  {
        return weight;
    }

    public void setWeight(double  weight)  {
        this.weight = weight;
    }

    public void speakHello()  {//根据输出结果倒推，需要在子类进行方法覆写
        System.out.println("hello!");
    }

    public void averageHeight()  {//根据输出结果倒推，需要在子类进行方法覆写
        System.out.println("avarge heigh:" + height);
    }

    public void averageWeight()  {//根据输出结果倒推，需要在子类进行方法覆写
        System.out.println("average weight:" + weight);
    }
}

class  AmericanPeople  extends  People  {//自己编写部分
    public void speakHello()  {//子类进行方法覆写
        System.out.println("hello,I am American!");
    }
    public void averageHeight()  {//子类进行方法覆写
        System.out.println("avarge heigh of American:" + height);
    }
    public void averageWeight()  {//子类进行方法覆写
        System.out.println("average weight of American:" + weight);
    }
    public void amercianBoxing() {
        System.out.println("I can boxing.");
    }
}

class  ChinaPeople  extends  People  {//自己编写部分
    public void speakHello()  {//子类进行方法覆写
        System.out.println("hello,I am ChinaPeople.");
    }
    public void averageHeight()  {//子类进行方法覆写
        System.out.println("avarge heigh of ChinaPeople:" + height);
    }
    public void averageWeight()  {//子类进行方法覆写
        System.out.println("average weight of ChinaPeople:" + weight);
    }
    public void chinaGongfu() {
        System.out.println("I can gongfu.");
    }
}
