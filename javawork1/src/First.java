import java.util.Scanner;
import java.util.*;
public class First {
    public static void main(String[] args) {
        System.out.println("选择题");
        System.out.println("1.A 2.B 3.D 4.A 5.D");
        System.out.println("打印三⻆");
        System.out.println("输入三角形的高");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        showTriangle(n);
        System.out.println("颠倒字符串");
        System.out.println("输入一段字符串");
        Scanner inputchar = new Scanner(System.in);
        String s = inputchar.next();
        reverseString(s);
        System.out.println("回⽂数判断");
        System.out.println("输入一个数");
        Scanner inputnum = new Scanner(System.in);
        int num = inputnum.nextInt();
        isPalindrome(num);
        System.out.println("水仙花数");
        ShuiXianHua();
        System.out.println("最大，最小数之和");
        arraysDemo();
    }

    public static void showTriangle(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <=i*2+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void reverseString(String s){
        char[] chars = s .toCharArray();
        int n=chars.length;
        char[] chara = new char[n];
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            chara[j]=chars[i];
        }
        String s1 = String.valueOf(chara);
        System.out.println(s1);
    }
    public static void isPalindrome(int num)
    {   Integer n=num;
        boolean flag = false;
        String str =(n).toString();
        char[] anum= str.toCharArray();
        char[] bnum= new char[anum.length];
        for(int i=0,j=anum.length-1;i<anum.length;i++,j--)
        {
            bnum[j]=anum[i];
        }
        String str1 = String.valueOf(bnum);
        if(str.equals(str1))
            System.out.println("是的");
        else
            System.out.println("不是");
    }
    public static void ShuiXianHua()
    {
        int ge=0;
        int shi=0;
        int bai=0;
        for(int n=100;n<1000;n++)
        {
            ge =n%10;
            shi =n/10%10;
            bai =n/100;
            if(n==(ge*ge*ge+shi*shi*shi+bai*bai*bai))
               System.out.printf(n+" ");
        }
        System.out.println();
    }
    public static void arraysDemo()
    {
        int sum=0;
        int[] ten ={43,342,231,654,435,123,34,343,123,45};
        int min=ten[0];
        int max=ten[0];
        for(int i=0;i<ten.length;i++)
        {
            if(min>ten[i])
            {
               min=ten[i];
            }
        }
        for(int i=0;i<ten.length;i++) {
            if (max < ten[i])
            {
                max = ten[i];
            }
        }
        sum=min+max;
        System.out.println("最小值为:"+min+"最大值为:"+max+"两数之和为:"+sum);
    }
}