package javabase.object.oriented.programming;

import javabase.pojo.Person;

class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.isMale = true;
        p1.age = 18;
        System.out.println(System.identityHashCode(p1));
        System.out.println(p1.hashCode());
        System.out.println(p1);
        Person p2 = new Person();
        System.out.println(System.identityHashCode(p2));
        System.out.println(p2.hashCode());
        System.out.println(p2);
        Person p3 = p1;//共用一个堆空间的对象实体
        p3.age = 22;
        System.out.println(System.identityHashCode(p3));
        System.out.println(p3.hashCode());
        System.out.println(p3);
    }
}