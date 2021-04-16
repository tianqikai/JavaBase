package javabase.datatype;
/**
 * BaseDataType1: 显性初始化
 * @description: 在方法内部必须先对基本数据类型变量赋值后才能使用，否则编译不通过。
 * @author: tianqikai
 * @date : 2021/4/15 0015
 */
public class BaseDataType1 {
    static int anInt;
    static boolean aBoolean;
    public static void main(String[] args) {
        int bnInt;
        boolean bBoolean;
        //输出0
        System.out.println(anInt);
        //输出false
        System.out.println(aBoolean);
        //未初始化的话，直接报错；需要初始化
        bnInt=0;
        bBoolean=true;
        System.out.println(bnInt);
        System.out.println(bBoolean);
    }
}
