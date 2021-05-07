package javabase.factory;
/**
 * @ClassName： 工厂方法
 * @description:
 * @author: tianqikai
 * @date : 10:09 2021/5/5
 */
//工厂接口
interface Factory{
   public abstract  Car getCar();
}
//奥迪工厂类
class AudiFactory implements Factory{
    @Override
    public Car getCar() {
        return  new Audi();
    }
}
//奥迪工厂类
class BydFactory implements Factory{
    @Override
    public Car getCar() {
        return  new BYD();
    }
}
public class Client03 {
    public static void main(String[] args) {
        AudiFactory a = new AudiFactory();
        a.getCar().run();
        BydFactory b = new BydFactory();
        b.getCar().run();
    }
}
