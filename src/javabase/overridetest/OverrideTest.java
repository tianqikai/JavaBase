package javabase.overridetest;

//重写测试
public class OverrideTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        Cat cat=new Cat();
        cat.eat();
        //这是一种“多态性”：同名的方法，用不同的对象来区分调用的是哪一个方法。
        //强制类型转换 会报错java.lang.ClassCastException
//        Cat cat1= (Cat) new Animal();
//        cat1.eat();
        Animal animal1=new Cat();
        //
        System.out.println(animal.getClass());
        if(animal1 instanceof Dog){
           Dog dog= (Dog)animal1;
           dog.eat();
        }

    }
}
