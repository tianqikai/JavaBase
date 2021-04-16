package javabase.datatype;

/**
 * BaseDataType2 :整数型
 * @description:
 * @author: tianqikai
 * @date : 2021/4/15 0015
 */
public class BaseDataType2 {
    public static void main(String[] args) {
        //byte 赋值范围 -128~127
        byte byte1=127;
        //超出赋值范围报错
        //byte byte2=128;

        //int 类型赋值范围 -2147483648~2147483647
        int a=10;
        int b= 2147483647;
        //超出赋值范围报错
        //int c= 2147483648;

        //程序将2147483648看做int类型，但是这个数据本身已经超出了int的取值范围。
        //long e = 2147483648;
        long e = b;//存在自动类型转换 int->long
        //正确的方法应该在后面加上L，这样就会把2147483648看做是long类型。
        //如果不加L的话，会把2147483648看成int类型，即默认会将整数的字面值看成是int类型
        long f = 2147483648L;
        System.out.println(byte1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
    }
}
