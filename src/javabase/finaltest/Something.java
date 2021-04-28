package javabase.finaltest;

public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
        System.out.println("i:"+o.i);
    }
    public void addOne(final Other o) {
//        o = new Other();
        o.i++;
    }
    public int addOne(final int x) {
    //return ++x;
     return x + 1;
    }
}
class Other {
    public int i;
}