package javabase.interfacetest;
/**
 * @ClassName：InterfaceTest
 * @description: 接口测试
 * @author: tianqikai
 * @date : 11:08 2021/5/4
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane=new Plane();
        method(plane);
        plane.work();
    }
    public static void method(Fly fly){
        fly.isFly();
        fly.isstop();
    }
}
