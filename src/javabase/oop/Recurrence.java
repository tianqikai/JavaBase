package javabase.oop;
/**
 * @ClassName：Recurrence
 * @description: 递归处理
 * @author: tianqikai
 */
public class Recurrence {
    public static void main(String[] args) {
        System.out.println( multiply(5));
        System.out.println( sum(5));
    }
    //求1-n个连续数字的阶乘
    public static int multiply(int n){
        if(n==1){
            return n;
        }else{
         return  n*multiply(n-1);
        }
    }
    //求1-n个连续数字的相加
    public static int sum(int n){
        if(n==1){
            return n;
        }else{
            return  n+sum(n-1);
        }
    }

}
