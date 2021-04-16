package javabase.operators;

/**
 * CountOperators :算术运算符
 * @description:
 * @author: tianqikai
 * @date : 2021/4/16 0016
 */
public class CountOperators {
    public static void main(String[] args) {
        //方法一
//        countOne();
        //方法二
//        countTwo();
        //方法三
//        countThree();
        //方法四
//        countFour();
        //方法五
//        countFive();
        //方法六
        countSix();
    }
    private static void countOne(){
        int a = 10;
        int b = 3;
        System.out.println(a + b); //13
        System.out.println(a - b); //7
        System.out.println(a * b); //30
        System.out.println(a / b); //3 因为是int类型，所以结果也是int类型
        System.out.println(a % b); //1
    }
    private static void countTwo(){
        int k = 10;
        k++;//相当于k = k + 1
        System.out.println("k=" + k);
        //这里面的+号是做的字符串相加的运算，输出结果为k=11
        int j = 5;
        ++j;//相当于j = j + 1
        System.out.println("j=" + j); //j=6
        int m = 8;
        m--;//相当于m = m - 1
        System.out.println("m=" + m); //m=7
        int n = 6;
        --n;//相当于n = n - 1
        System.out.println("n=" + n); //n=5
    }
    private static void countThree(){
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;
        c = --a;
        b = ++a;
        a = c--;

        System.out.println("a = " + a + ",b = " + b + ",c = " + c);
    }
    private static void countFour(){
        //存在运算符优先级问题
        int x = 4;
        int y = (x++)+(++x)+(x*10);
        System.out.println("x = " + x + ",y = " +  y);
    }
    private static void countFive(){
        byte b = 10;
//        b = b + 1;//报错，应该赋值给一个int类型的值，因为1默认为int类型，b为byte类型报错
        int c=b+1;
        System.out.println("b = " + b);
    }
    private static void countSix(){
        int i = 0;
        i = i++;
        System.out.println(i);
        //答案为零，尽量不要这样写。可以 i+=1; i++; ++i;都可以
    }
}
