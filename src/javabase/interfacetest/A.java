package javabase.interfacetest;

interface A {
    int x = 0;
}
class B {
    int x = 1;
}
class C extends B implements A {
    public void pX() {
        // 继承和接口是同级并排的，无法判断x是谁的，实际开发中变量名保持不同命名
//        System.out.println(x);
        System.out.println(super.x);//B 1
        System.out.println(A.x);//A 0
    }
    public static void main(String[] args) {
        new C().pX();
    } 
}