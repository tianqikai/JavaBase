package javabase.polymorphism;
/**
 * @ClassName：Person
 * @description: 人类
 * @author: tianqikai
 * @date : 22:51 2021/4/25
 */
public class Person {
    //姓名
    public String name;
    //年龄
    public int age ;
    //是否是男性
    public boolean isMale;
    public void  eat(){
        System.out.println("人在吃饭！");
    }
}