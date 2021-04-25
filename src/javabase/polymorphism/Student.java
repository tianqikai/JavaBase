package javabase.polymorphism;
/**
 * @ClassName：Student
 * @description: 学生类
 * @author: tianqikai
 *
 * 多态的前提条件
 * ● 有继承
 * ● 有方法重写
 * ● 有父类引用指向子类对象
 */
public class Student extends Person{
    public int id;
    public int grade;
    public int Class;
    @Override
    public void  eat(){
        System.out.println("学生在食堂吃饭！");
    }
    public  void learn(){
        System.out.println("学生在学习！");
    }
}
