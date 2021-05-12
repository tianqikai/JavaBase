package javabase.thread;

import java.util.Scanner;

/**
 * @ClassName：ThreadTest4
 * @description: Runable实现
1) 定义子类，实现Runnable接口。
2) 子类中重写Runnable接口中的run方法。
3) 通过Thread类含参构造器创建线程对象。
4) 将Runnable接口的子类对象作为实际参数传递给Thread类的构造器中。
5) 调用Thread类的start方法：开启线程，调用Runnable子类接口的run方法。
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        System.out.println("请输入今天的总票数：");
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();
        System.out.println("开始售票！");
        MyThread4 myThread4=new MyThread4();
        myThread4.setTicket(ticket);
        Thread thread1=new Thread(myThread4);
        Thread thread2=new Thread(myThread4);
        Thread thread3=new Thread(myThread4);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class MyThread4 implements Runnable{
    private  static int ticket;

    public void setTicket(int ticket) {
        MyThread4.ticket = ticket;
    }

    @Override
    public   void run() {
        while(true){
//            synchronized(this){// 主方法中只new了一个对象，所以锁this是可以的，锁的就是myThread4这个对象
//            synchronized(MyThread4.class){
//                if (this.ticket>0){
//                    System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+this.ticket);
//                    this.ticket--;
//                }
//            }
//            method();
            method2();
            if(MyThread4.ticket<=0){
                break;
            }
        }
    }

    public synchronized void method(){ //这里锁住的是this 当前类的对象
        if (MyThread4.ticket>0){
            System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+MyThread4.ticket);
        }
        MyThread4.ticket--;
    }
    // 需要 ticket是静态变量才可以使用
    public static synchronized void method2(){//这里锁住的是this 当前类的对象
        if (MyThread4.ticket>0){
            System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+MyThread4.ticket);
        }
        MyThread4.ticket--;
    }
    /**
     * 方式一：同步代码块
     *  synchronized(同步监视器){
     *      需要同步的代码块
     *  }
     *  说明：
     *  1.同步代码块-》即操作共享数据的代码块 不能多了，也不能少了；多了可能导致效率低，少了可能会锁不住
     *  2.共享数据：多个线程共同操作的变量叫做共享数据 比如：上边的 ticket
     *  3.同步监视器：俗称锁，可以为任意类的对象；要求必须是多线程必须共用一把锁
     *
     *  方式二：同步方法
     *  把操作共享数据的方法整个放在一个方法中，我们称这个方法为同步方法
     *
     *  同步方式优点缺点
     *  优点：解决了线程安全问题
     *  缺点：效率低
     *
     */
}

