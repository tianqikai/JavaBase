package javabase.datatype;

/**
 * BaseDataTypeAutoConversion :
 * @description: 自动类型转换
 * @author: tianqikai
 * @date : 2021/4/15 0015
 */
public class BaseDataTypeAutoConversion {
    public static void main(String[] args) {
        byte byte1=127;
        short short1=1;
        int int1=short1;
        int int2=byte1;// byte 自动转换位int
        //高级向低级转换报错
        //s=i;
        long long1=100000;// int自动装换为long
        float float1=111.12F;
        double double1=float1;//float自动装换为double
        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);
    }
}
