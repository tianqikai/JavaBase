package javabase.polymorphism;
/**
 * @ClassName：PloymorphismTest
 * @description:多态测试
 * @author: tianqikai
 * @date : 23:25 2021/4/25
 */
public class PloymorphismTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.eat();
        student.learn();
        //编译看左边，运行看右边
        Person person=new Student();
        person.eat(); //父类中有eat方法，子类重写了该方法，实际运行中执行的是子类重写的方法
        //一个引用类型变量如果声明为父类的类型，但实际引用的是子类对象，那么该变量就不能再访问子类中添加的属性和方法
//        person.learn();//编译报错
    }
}
