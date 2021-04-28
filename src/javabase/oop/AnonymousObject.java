package javabase.oop;

import javabase.pojo.Person;
import java.math.BigDecimal;
/**
 * @ClassName：AnonymousObject
 * @description: 匿名类的使用
 * @author: tianqikai*/
public class AnonymousObject {
    public static void main(String[] args) {
        System.out.println(new Person().getAge());

        System.out.println(new BigDecimal(1));
    }
}
