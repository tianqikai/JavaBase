package javabase.interfacetest;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName：Interface8
 * @description: java8 接口
 * @author: tianqikai
 * @date : 2:16 2021/5/5
 */

public interface Interface8 {
    public static void method1(){
        System.out.println("Interface8 java8 接口静态方法1");
    }
    public default  void method2(){
        System.out.println("Interface8 java8 接口默认方法2");
    }
    public default  void method3(){
        System.out.println("Interface8 java8 接口默认方法3");
    }

}
interface InterfaceB {
    public static void method1(){
        System.out.println("InterfaceB java8 接口静态方法1");
    }
    public default  void method2(){
        System.out.println("InterfaceB java8 接口默认方法2");
    }
    public default  void method3(){
        System.out.println("InterfaceB java8 接口默认方法3");
    }

}
class FatherClass{
    public  void method1(){
        System.out.println("FatherClass 父类静态方法1");
    }
    public static void method4(){
        System.out.println("FatherClass 父类静态方法4");
    }
}
class SubClass extends FatherClass implements Interface8,InterfaceB{
    //Interface8,InterfaceB 存在同名方法method2 method3，,就会接口冲突。
    @Override
    public void method2() {
        System.out.println("SUBclass 接口默认方法2");
        //接口的静态方法可以直接调用
        Interface8.method1();
        InterfaceB.method1();
    }

    @Override
    public void method3() {
        System.out.println("SUBclass 接口默认方法3");
    }
    public void myMethod() {
        SubClass subClass=new SubClass();
        super.method1();
        //：类优先原则。接口中具有 ;相同名称和参数的默认方法会被忽略。
        subClass.method1();
        method4();
        // 调用接口中默认方法
        Interface8.super.method2();
        InterfaceB.super.method2();
    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.myMethod();

    }
}
