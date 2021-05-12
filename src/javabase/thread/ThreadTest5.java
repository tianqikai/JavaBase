package javabase.thread;

import java.util.Scanner;

/**
 * @ClassName：ThreadTest5
 * @description:
 * @author: tianqikai
 * @date : 20:32 2021/5/5
 */
public class ThreadTest5 {
    public static void main(String[] args) {
        System.out.println("请输入今天的总票数：");
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();
        System.out.println("开始售票！");

        MyThread5 thread1=new MyThread5();
        MyThread5 thread2=new MyThread5();
        MyThread5 thread3=new MyThread5();
        //
        thread1.setTicket(ticket);
        thread2.setTicket(ticket);
        thread3.setTicket(ticket);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class MyThread5 extends Thread {
    private static  int ticket;
    Object object=new Object();

    public void setTicket(int ticket) {
        MyThread5.ticket = ticket;
    }

    @Override
    public void run() {
        while (true) {
//            synchronized (this) {// 主方法中是三个不同的对象，这种方式不可取
//            synchronized (MyThread5.class) {
//                if (MyThread5.ticket > 0) {
//                    System.out.println(Thread.currentThread().getName() + " |卖出去的票号：" + MyThread5.ticket);
//                    MyThread5.ticket--;
//                }
//            }
            try {
                MyThread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            method2();
            if (MyThread5.ticket <= 0) {
                break;
            }

        }
    }
    // 需要 ticket是静态变量才可以使用
    public static synchronized void method2(){//这里锁住的是MyThread5.class 当前类的对象
        if (MyThread5.ticket>0){
            System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+MyThread5.ticket);
        }
        MyThread5.ticket--;
    }
}
