package javabase.oop;

import javabase.pojo.Animal;
import javabase.pojo.Person;
import javabase.pojo.Women;

/**
 * @program: Zoo
 * @description: 封装和隐藏
 * @author: tianqikai
 **/
public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.leg=100;
        System.out.println("leg:"+animal.leg);


        Women women =new Women();
//        women.name="小花"; //不能直接赋值
        women.setName("小明");
        System.out.println("name:"+women.getName());
    }
}
