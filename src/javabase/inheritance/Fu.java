package javabase.inheritance;
/**
 * @ClassName：父类
 * @description:
 * @author: tianqikai
 * @date : 23:00 2021/4/27
 */
public class Fu {
    public  String name="父类";
    static{
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类构造代码块");
    }
    public  Fu (){
        System.out.println("父类构造方法");
    }

}
