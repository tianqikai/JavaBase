package javabase.statictest;
/**
 * @ClassName：StaticTest
 * @description: static关键字
 * @author: tianqikai
 * @date : 20:48 2021/5/3
 */
public class StaticTest {
    public static void main(String[] args) {

        System.out.println(Chinese.country);
        //饿汉式
        BankCard bankCard1 = BankCard.getBankCard();
        BankCard bankCard2 = BankCard.getBankCard();
        System.out.println(bankCard1==bankCard2);
        //懒汉式
        Order order1=Order.getOrder();
        Order order2=Order.getOrder();
        System.out.println(order1==order2);
    }
}
