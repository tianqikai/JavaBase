package javabase.finaltest;

public class FinalTest {
    //final修饰变量——常量
    final String NAME="final";
    //全局常量
    static final String NAME2="final";
    public static void main(String[] args) {
        final String NAME3="final";
//        System.out.println(NAME); //不是全局常量，作用域不在main方法中
        System.out.println(NAME2);
        System.out.println(NAME3);
    }
    final  class A{
        A(){
            System.out.println("AAAAAAA");
        }
    }
    // final修饰的类不能被继承
//    class B extends A{
//        B(){
//            System.out.println("BBBbBBB");
//        }
//    }
    class C {
        public final void print() {
            System.out.println("A");
        } }
    class D extends C {
//        public void print() { // 错误，不能被重写。
//            System.out.println("尚硅谷");
//        }
    }
}
