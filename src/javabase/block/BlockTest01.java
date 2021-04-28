package javabase.block;

public class BlockTest01 {
    public static void main(String[] args) {
        System.out.println("main方法");
        //局部代码块
        {
            int x = 10;                        //限定变量的声明周期
            System.out.println(x);
        }

        Student s1 = new Student();
        System.out.println("---------------");
        Student s2 = new Student();

    }

    static {
        System.out.println("main方法类中的静态代码块");
    }
}

class Student {

    public Student(){

        System.out.println("Student构造方法");
    }                    

    //构造代码块:每创建一次对象就会执行一次,优先于构造方法执行
    {
        System.out.println("Student构造代码块");
    }

    static {                                    //随着类加载而加载,且只执行一次
        System.out.println("Student静态代码块");    //作用:用来给类进行初始化,一般用来加载驱动
    }                                            //静态代码块是优先于主方法执行
}