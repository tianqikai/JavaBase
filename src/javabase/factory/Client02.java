package javabase.factory;


/**
 * @ClassName： 简单工厂
 * @description:
 * @author: tianqikai
 * @date : 10:09 2021/5/5
 */
//工厂类
class CarFactory {
    //方式一
    public static Car getCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new BYD();
        } else {
            return null;
        }
    }
}
//方式二
// public static Car getAudi() {
// return new Audi();
// }
//
// public static Car getByd() {
// return new BYD();
// } }
public class Client02 {
    public static void main(String[] args) {
        Car a = CarFactory.getCar("奥迪");
        a.run();
        Car b = CarFactory.getCar("比亚迪");
        b.run();
    }
}
