package javabase.abstracttest;
/**
 * @ClassName：AbstractTest02
 * @description: 接口检查
 * @author: tianqikai
 * @date : 0:33 2021/5/4
 */
public class AbstractTest02 {
    public static void main(String[] args) {
        CheckInterface ck1=new CheckZi1();
        ck1.check();
        CheckInterface ck2=new CheckZi2();
        ck2.check();
    }
}
abstract class CheckInterface{

    public void tycheck(){
        System.out.println("通用检查方法");
    };
    abstract  void tedingcheck();

    public void check(){
        this.tycheck();
        this.tedingcheck();
    };
}
class CheckFu extends  CheckInterface{

    @Override
    void tedingcheck() {
        System.out.println("父类检查！！！");
    }
}
class CheckZi1 extends CheckFu{
    @Override
    void tedingcheck() {
        System.out.println("子类检查！！！");
    }
}

class CheckZi2 extends CheckFu{

}
