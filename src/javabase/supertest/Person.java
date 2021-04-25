package javabase.supertest;

/**
 * @classname : Person
 * @description: 人类
 * @author: tianqikai
 */
public class Person {
//    姓名
    public String name;
    //年龄
    public int age ;
    //是否是男性
    public boolean isMale;

    public  Person(String name, int age,boolean isMale){
        this.name=name;
        this.age=age;
        this.isMale=isMale;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}