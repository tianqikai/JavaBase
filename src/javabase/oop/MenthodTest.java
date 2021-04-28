package javabase.oop;
/**
 * @ClassName：MenthodTest
 * @description: 方法调用过程
 * @author: tianqikai
 */
public class MenthodTest {

    public static void main(String[] args) {
        methodOne();
    }
    public static void methodOne(){
        System.out.println("Hello world! One");
        methodTwo();
    }
    public static void methodTwo(){
        System.out.println("Hello world! two");
        methodThree();
    }
    public static void methodThree(){
        System.out.println("Hello world! three");
    }
}
