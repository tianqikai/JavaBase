package javabase.statictest;
/**
 * @ClassName：BankCard
 * @description:单例模式--饿汉式
 * @author: tianqikai
 * @date : 22:06 2021/5/3
 */
public class BankCard {
    // 1.私有化构造器

    private  BankCard(){

    }
    // 2.内部提供一个当前类的实例
    // 3.此实例也必须静态化
    private  static BankCard bankCard=new BankCard();

    // 4.提供公共的静态的方法，返回当前类的对象

    public  static  BankCard getBankCard(){
        return bankCard;
    }
}
