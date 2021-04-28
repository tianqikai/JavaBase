package javabase.oop;
/**
 * @ClassName：OverloadMethod
 * @description: 方法重载
 * @author: tianqikai
 * @date : 22:12 2021/4/25
 */
public class OverloadMethod {
    public static void main(String[] args) {
        int[] intArray=new int[]{1,2,3};
        System.out.println(intArray); //打印的是int数组地址 println(Object x)
        char[] chars=new char[]{'a','b','c'};
        System.out.println(chars); //打印的char型数组的值 println方法重写 println(char x[])
    }
}
