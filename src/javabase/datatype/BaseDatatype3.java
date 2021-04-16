package javabase.datatype;

/**
 * BaseDatatype3 :浮点型
 * @description:float double
 * @author: tianqikai
 * @date : 2021/4/15 0015
 */
public class BaseDatatype3 {
    public static void main(String[] args) {
        // java默认使用double浮点类型
        double a=3.14111;
        //会报错
        //float b=3.1415;
        float c=3.1415F;
        float d=3.1415f;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
