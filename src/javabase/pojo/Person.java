package javabase.pojo;

/**
 * @classname : Person
 * @description: 人类
 * @author: tianqikai
 */
public class Person{
//    姓名
    public String name;
    //年龄
    public int age ;
    //是否是男性
    public boolean isMale;

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