package javabase.block.javabase;

import javabase.inheritance.Person;

import java.util.Date;

public class ExecptionTest {
    public static void main(String[] args) {
        arithmeticExceptionTest();
        arrayIndexOutOfBoundsExceptionTest();
        nullPointerExceptionTest();
        classCastExceptionTest();
    }
    //算术运算符异常
    public static void arithmeticExceptionTest() {
        int y;
        y=3/0;
        System.out.println("program ends ok!");
    }
    //空指针异常
    public  static  void nullPointerExceptionTest(){
        Person person;
        person=null;
        System.out.println(person.age);
    }
    //类型转换异常
    public static void classCastExceptionTest() {
        Object obj = new Date();
        Person person;
        person = (Person) obj;
        System.out.println(person);
    }
    //数组越界异常
    public static void arrayIndexOutOfBoundsExceptionTest() {
        String friends[] = { "lisa", "bily", "kessy" };
        for (int i = 0; i < 5; i++) {
            System.out.println(friends[i]); // friends[4]?
        }
        System.out.println("\nthis is the end");
    }
}
