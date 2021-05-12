package javabase.string;

public class StringTest04 {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b'; }
    public void changeMethod(String str, char ch[]) {
        this.str = "test ok";
        this.ch[0] = 'b'; }
    public static void main(String[] args) {
        StringTest04 ex = new StringTest04();
//        ex.changeMethod(ex.str, ex.ch);
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}