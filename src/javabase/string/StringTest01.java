package javabase.string;

public class StringTest01 {
    public static void main(String[] args) {
        String str1=new String("abc");
        System.out.println(System.identityHashCode(str1));
        str1=new String("abc");
        System.out.println(System.identityHashCode(str1));

        String s1 = "abc";//字面量的定义方式
        System.out.println(System.identityHashCode(s1));
        String s2 = "abc";
        System.out.println(System.identityHashCode(s2));
        s1 = "hello";
        System.out.println(System.identityHashCode(s1));

    }
}
