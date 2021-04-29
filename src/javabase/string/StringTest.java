package javabase.string;

public class StringTest {
    public static void main(String[] args) {
        String str1="1111111111";
        String str2=str1;
        //“1111111111”示常量存放在常量池中，str1 str2指向同一块内存地址
        System.out.println(str1==str2);
        System.out.println("============================================");
        String s1="abc";
        String s2="a"+"b"+"c";
        String s3="abc"+"";
        String s4=s3+"";
        String s5=new String("abc");
        String s6=s3.intern();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println( System.identityHashCode(s1));
        System.out.println( System.identityHashCode(s2));
        System.out.println( System.identityHashCode(s3));
        System.out.println( System.identityHashCode(s4));
        System.out.println( System.identityHashCode(s5));
        System.out.println( System.identityHashCode(s6));


    }
}
