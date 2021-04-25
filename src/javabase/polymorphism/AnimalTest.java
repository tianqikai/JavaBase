package javabase.polymorphism;

import com.sun.istack.internal.NotNull;

import java.util.Random;

/**
 * @ClassName：AnimalTest
 * @description:
 * @author: tianqikai
 * @date : 23:54 2021/4/25
 */
public class AnimalTest {
    public static void main(String[] args) {
        method(new Dog());
        method(new Cat());

        Animal animal=methodTwo(new Random().nextInt(3));
        animal.eat();
    }

    //不用方法的重载，一个方法实现
    private static void method(Animal animal){
        animal.eat();
    }

    private static Animal methodTwo(int key){
        System.out.println("key:"+key);
        switch (key){
            case 0:
            {
                return new Animal();
            }
            case 1:
            {
                return new Dog();
            }
            case 2:
            {
                return new Cat();
            }
            default:{
                return null;
            }
        }

    }
}
class Animal{
    public  String name;
    public void eat(){
        System.out.println("动物吃东西！");
    }
}
class Dog extends Animal{
    public  String name="狗";
    @Override
    public void eat(){
        System.out.println("狗吃东西！");
    }
}
class Cat extends Animal{
    public  String name="猫";
    @Override
    public void eat(){
        System.out.println("猫吃东西！");
    }
}
