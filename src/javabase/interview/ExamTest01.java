package javabase.interview;

public class ExamTest01 {
    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get1());
    }
    public static int get(){
        int num=10;
        try{
            return  num;
        }finally {
            num++;
            System.out.println("END");
        }
    }
    public static int get1(){
        int num=10;
        try{
            throw  new RuntimeException();
        }catch (RuntimeException e){
            num+=10;
            return num;
        } finally {
            num++;
            System.out.println("END");
            return num;
        }
    }
}
