package javabase.string;

import javabase.pojo.Person;

public class StringTest03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        Person p2 = new Person();
        p2.name = "小明";
        System.out.println(p1.name .equals( p2.name)); //true
        System.out.println(p1.name == p2.name); //true
        System.out.println(p1.name == "小明"); //true
    }
}
