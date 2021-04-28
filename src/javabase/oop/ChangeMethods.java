package javabase.oop;
/**
 * @ClassName：ChangeMethods
 * @description: 可变形参
 * @author: tianqikai
 */
public class ChangeMethods {
    public void test(String[] msg){
        String message="";
        for(int i=0;i<msg.length;i++){
            message=message+msg[i];
        }
        System.out.println("含字符串数组参数的test方法 :"+message);
    }
    public void test1(String book){
        System.out.println("****与可变形参方法构成重载的test1方法****:"+book);
    }
    public void test1(String ... books){
        String message="";
        for(int i=0;i<books.length;i++){
            message=message+books[i];
        }
        System.out.println("****形参长度可变的test1方法****:"+message);
    }
    public static void main(String[] args){
        ChangeMethods to = new ChangeMethods();
        //下面两次调用将执行第二个test方法
        to.test1();
        to.test1("aa" , "bb");
        //下面将执行第一个test方法
        to.test(new String[]{"aa"});
    }
}
