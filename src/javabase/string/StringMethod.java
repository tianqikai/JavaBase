package javabase.string;
/**
 * @ClassName：StringMethod
 * @description: String的方法
 * @author: tianqikai
 * @date : 22:56 2021/5/6
 */
public class StringMethod {
    public static void main(String[] args) {
        String str=new String("aaaaaaa【、【、；‘vddvsvd1241052bbvgdasvg我舍得广播纳斯达克VG不上课bd");
        System.out.println("str长度："+str.length());
        System.out.println("str出现XXX的位置："+str.indexOf("XXX"));//不存在返回-1
        System.out.println("str出现我舍得的位置："+str.indexOf("我舍得"));//返回指定子字符串在此字符串中第一次出现处的索引
        System.out.println("str出现我舍得的位置："+str.indexOf("我舍得",37));//返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
        System.out.println("str出现v的位置："+str.lastIndexOf("v"));//返回指定子字符串在此字符串中最右边出现处的索引
        System.out.println("str:"+str.replaceAll("我舍得","你舍得"));
        System.out.println("str:"+str);//String不可变
        System.out.println("str:"+new String(str.replace("a","A")));
        System.out.println("substring:"+str.substring(1,20));

        String str1="123|234|123sd|5467|sda";

        String[] strArray=str1.split("\\|");
        for (String array:strArray){
            System.out.println(array);
        }

        System.out.println("aa".equals(new String("aa")));
        System.out.println("".isEmpty());
        System.out.println("  aa sdss  ".trim());

        System.out.println("aaaa".compareTo("aaaa"));
        System.out.println("aaaa".compareTo("aaaa111"));
        System.out.println("end");
    }
}
