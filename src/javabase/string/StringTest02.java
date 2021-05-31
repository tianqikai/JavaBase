package javabase.string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "javaEE";
        String s2 = "javaEE";
        String s5 = s1;
        String s7="EE";
        String s6 = "java"+s7;
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s5);//true
        System.out.println(s6 == s1);//false
    }
}
