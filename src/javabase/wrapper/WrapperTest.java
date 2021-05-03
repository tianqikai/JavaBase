package javabase.wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        new WrapperTest().method1();
    }
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//比较的内存地址 false
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);// 下面程序不会在堆中创建对象，会直接从整型常量池中拿。
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);// 大于127 无法自动拆箱，比较的还是内存地址
    }
}
