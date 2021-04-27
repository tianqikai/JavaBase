package javabase.Objecttest;


import javabase.pojo.Animal;
import javabase.pojo.Person;

/**
 * @ClassName：EqualTest
 * @description: equal比较
 * @author: tianqikai
 */
public class EqualTest {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.leg='1';
        Animal a2=new Animal();
        a2.leg='1';
        if(a1.equals(a2)){
            System.out.println("a1 a2 相等");
        }
        Person p1=new Person();
        p1.name="小明";
        Person p2=new Person();
        p2.name="小明";
        if(p1.equals(p2)){
            System.out.println("p1 p2 相等");
        }
        // String的equal方法已经重写过了 比较的是值，不是内存大小
        String s1=new String();
        s1="1111111111";
        String s2=new String();
        s2="1111111111";
        System.out.println(s1.equals(s2));
    }
}
