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
public class ThreadTest6 {
    public static void main(String[] args) {
        System.out.println("请输入今天的总票数：");
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();
        System.out.println("开始售票！");
        MyThread6 myThread6=new MyThread6();
        myThread6.setTicket(ticket);
        Thread thread1=new Thread(myThread6);
        Thread thread2=new Thread(myThread6);
        thread1.start();
        thread2.start();
//        thread1.notifyAll();
//        thread2.notifyAll();
    }
}
class MyThread6 implements Runnable{
    private   int ticket;

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public   void run() {
        while(true){
            synchronized(this){// 主方法中只new了一个对象，所以锁this是可以的，锁的就是myThread4这个对象
                this.notify();
                if (this.ticket>0){
                    System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+this.ticket);
                    this.ticket--;
                    if(this.ticket>0){
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            if(this.ticket<=0){
                break;
            }
        }
    }
}

