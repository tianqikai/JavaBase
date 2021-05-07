package javabase.abstracttest;
/**
 * @ClassName：AbstractTest
 * @description: 抽象类测试
 * @author: tianqikai
 * @date : 0:05 2021/5/4
 */
public class AbstractTest {
    public static void main(String[] args) {
        Person p1=new Student();
        p1.eat();
        p1.run();
        Person p2=new Doctor();
        p2.eat();
        p2.run();
    }
}
abstract class Person {
    private String name;
    private int age;

    abstract void run();
    abstract void eat();
}
class Student extends Person{

    @Override
    void run() {
        System.out.println("学生在学校跑步");
    }

    @Override
    void eat() {
        System.out.println("学生在学校吃饭");
    }
}
class Doctor extends Person{

    @Override
    void run() {
        System.out.println("医生在医院跑步");
    }

    @Override
    void eat() {
        System.out.println("医生在医院吃饭");
    }
}
