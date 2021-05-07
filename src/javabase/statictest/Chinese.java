package javabase.statictest;
/**
 * @ClassName： Chinese
 * @description: 中国人
 * @author: tianqikai
 * @date : 20:45 2021/5/3
 */

public class Chinese {
    static String country="中国";
    public String name;
    public  int age;
//    public static void setCountry(String country){
//        this.country=country;////非法，在static方法中不能有this，也不能有super
//    }
    //在static方法内部只能访问类的static修饰的属性或方法，不能访问类的非static的结构。
//    public static void getCountry(){
//        System.out.println(country);
//        System.out.println(this.name);
//    }
}
