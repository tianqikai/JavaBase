package javabase.statictest;
/**
 * @ClassName：Order
 * @description: 懒汉式--单例模式
 * @author: tianqikai
 * @date : 22:07 2021/5/3
 */
public class Order {
    // 1.私有化构造方法
    private  Order(){

    }
    // 静态的实例化对象
    private static Order order=null;
    // 返回对象的方法 ，需要时创建
    /**
     * @Method： getOrder
     * @Description：获取order实例
     */
    public synchronized  static Order getOrder(){
        if(order==null){
            //并发时，存在线程安全问题，加synchronized锁处理
            order=new Order();
        }
        return order;
    }
}
