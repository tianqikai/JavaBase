package javabase.object.oriented.programming;

import java.io.PrintStream;

/**
 * @ClassName：MethodPass
 * @description: 值得传递
 * @author: tianqikai
 */
public class MethodPass {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        //调用method，使打印结果为 a=100 b=200
        method1(a,b);
        method2(a,b);
        method3(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    //可行
    public static void method1(int a,int b){
        System.out.println(" a = " + a * 10);
        System.out.println(" b = " + b * 20);
        //终止当前运行的java虚拟机
        System.exit(0);
    }
    //方法二：可行
    private static void method2(int a, int b) {
        PrintStream stream = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if("a=10".equals(x)) {
                    x = ("a=100");
                }else if("b=10".equals(x)) {
                    x = ("b=200");
                }
                super.println(x);
            }
        };
        System.setOut(stream);
    }
    //不可行
    public static void method3(int a,int b){
        a=a * 10;
        b=b * 20;
    }
}
