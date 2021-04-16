package javabase.operators;

/**
 * AssignmentOperator :赋值运算符
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        //基本的赋值运算符
        int a = 10;
        //追加
        a += 10; //a = a+10;
        System.out.println(a); //20

        //a==20
        a -= 5;
        System.out.println(a); //15

        //a==15
        a *= 3;
        System.out.println(a); //45

        //a==45
        a /= 15; // a = a/15;
        System.out.println(a); //3

        //a==3
        a %= 2; //a = a%2;
        System.out.println(a); //1


        //基本赋值运算符和扩展赋值运算符的区别
        byte i = 10;

        //编译无法通过。运算结果是int类型，前边的变量是byte类型.
        //i = i + 10;

        //语法：扩展赋值运算符不改变运算结果类型。可能损失精度。
        i += 10;

        //虽然编译通过，精度损失严重。
        //最初变量是byte，最终还是byte类型
        //相当于i = (byte)(i+10000);
        i += 1000;
    }
}
