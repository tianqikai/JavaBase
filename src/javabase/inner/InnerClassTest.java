package javabase.inner;
/**
 * @ClassName：InnerClassTest
 * @description: 内部类
 * @author: tianqikai
 * @date : 10:31 2021/5/5
 */
public class InnerClassTest {
    String name="内部类";
    static int id=87;
    public InnerClassTest() {

    }
    public void run(){
        System.out.println("跑步！");
        Work.moving();//访问静态内部类方法
    }
    public  void method(){

        new Person().eat();//访问非静态成员内部类方法
    }
    // 成员内部类
    class Person{
        private String name;
        public  Person(){

        }
        public void eat(){
            System.out.println("人在吃饭！");
            run();//调用外部类的的非静态成员方法
            InnerClassTest.this.run();//调用外部类的非静态成员方法
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setName() {
            this.name = InnerClassTest.this.name;//重名时，调用外部类的的属性
        }
    }
    // 静态的成员内部类
    static class Work{
        private int id;
        public static void moving(){
            System.out.println("机器在运转工作！");
//            InnerClassTest.this.run();报错
        }
        public  void move(){
            System.out.println("机器在运转工作！");
//            InnerClassTest.this.run();报错
        }
        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        //创建非静态内部类
        InnerClassTest In=new InnerClassTest();
        In.method();
        System.out.println("--------------------------");
        InnerClassTest.Person person=In.new Person();
        person.eat();
        System.out.println("--------------------------");
//        创建静态的内部类
        InnerClassTest.Work work=new InnerClassTest.Work();
        work.move();
    }
}
