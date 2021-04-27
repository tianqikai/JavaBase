package javabase.inheritance;
/**
 * @ClassName：子类
 * @description:
 * @author: tianqikai
 * @date : 23:00 2021/4/27
 */
public class Zi extends Fu{
    public  String name="子类";
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public  Zi (){
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        Zi zi=new Zi();
    }
}
