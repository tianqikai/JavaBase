package javabase.interfacetest;
/**
 * @ClassName：plane
 * @description:飞机
 * @author: tianqikai
 * @date : 11:10 2021/5/4
 */
public class Plane extends machine implements Fly{
    public static void main(String[] args) {
        Plane plane=new Plane();
        plane.isFly();
        plane.work();
        plane.isstop();
    }
    @Override
    public void work() {
        System.out.println("飞机飞行！");
    }

    @Override
    public void isFly() {
        System.out.println("飞机能飞！");
    }

    @Override
    public void isstop() {
        System.out.println("飞机降落！");
    }
}
