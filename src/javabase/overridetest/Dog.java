package javabase.overridetest;
/**
 * @ClassName：Dog
 * @description:
 * @author: tianqikai
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗爱吃狗粮！");
    }
}
