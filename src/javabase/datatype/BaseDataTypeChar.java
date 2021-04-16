package javabase.datatype;
/**
 * BaseDataTypeChar :char字符
 * @description:
 * @author: tianqikai
 * @date : 2021/4/15 0015
 */
public class BaseDataTypeChar {
    /**
     * char的取值范围：0~65536
     * unicode对应的码值
     * 'a' 97
     * 'A' 65
     * '0' 48
     */
    public static void main(String[] args) {
        char c1='a';
        // 一个汉字两个byte，所有char能存储
        char c2='汉';
        //char只能赋值为一个字符
        //char c3 = 'ab';//错误error
        //abcd efg hijk lmn opq rst uvw xyz
        char c4=97;
        char c5=65;
        char c6=48;
        char c7='\"';//双引号
        char c8='\'';//单引号
        char c9='\\';//反斜线
        System.out.println(c1);
        System.out.println(c2);
//        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
    }
}
