package javabase.interfacetest;
/**
 * @ClassName：Car
 * @description: 车
 * @author: tianqikai
 * @date : 20:33 2021/5/4
 */
public class Car implements Fly,Runner{

    @Override
    public void isFly() {
        System.out.println("汽车不能飞！");
    }

    @Override
    public void isstop() {
        System.out.println("汽车可以停下来！");
    }

    @Override
    public void run() {
        System.out.println("汽车能跑！");
    }

    @Override
    public void isWalk() {
        System.out.println("汽车能够慢走！");
    }

}
