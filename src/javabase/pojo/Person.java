package javabase.pojo;

import java.util.Objects;

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

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                isMale == person.isMale &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMale);
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