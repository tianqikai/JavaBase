package javabase.inner;
/**
 * @ClassName：InnerClassTest1
 * @description: 局部内部类
 * @author: tianqikai
 * @date : 11:24 2021/5/5
 */
public class InnerClassTest1 {
    //开发中很少见
    public  void method(){
        class AA{

        }
    }
    public Comparable getComparable(){

        class  MyComparable implements  Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
    public Comparable getComparable1(){

        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
