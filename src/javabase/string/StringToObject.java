package javabase.string;
/**
 * @ClassName：StringToObject
 * @description:
 * @author: tianqikai
 * @date : 23:15 2021/5/6
 */
public class StringToObject {
    public static void main(String[] args) {
        int a=100;
        String str=Integer.toString(a);
        str=String.valueOf(a);
        System.out.println(str);
        int b= Integer.parseInt(str);
        System.out.println(b);
        String str2=Double.toString(12.01);
        str2=Float.toString(12.01F);

        char[] chars={'1','2','a','b'};
        System.out.println(new String(chars));
        System.out.println(String.valueOf(chars));
        System.out.println( "aaaaa".toCharArray().length);
        System.out.println("dddd".getBytes());
        System.out.println(new String("dddd".getBytes()));
    }
}
