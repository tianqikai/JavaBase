package javabase.thread;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName：ThreadTest4
 * @description: Runable实现
1) 定义子类，实现Runnable接口。
2) 子类中重写Runnable接口中的run方法。
3) 通过Thread类含参构造器创建线程对象。
4) 将Runnable接口的子类对象作为实际参数传递给Thread类的构造器中。
5) 调用Thread类的start方法：开启线程，调用Runnable子类接口的run方法。
 */
public class LockTest {
    public static void main(String[] args) {
        System.out.println("请输入今天的总票数：");
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();
        System.out.println("开始售票！");
        MyThreadLock myThreadLock=new MyThreadLock();
        myThreadLock.setTicket(ticket);
//        Window myThreadLock=new Window();
        Thread thread1=new Thread(myThreadLock);
        Thread thread2=new Thread(myThreadLock);
        Thread thread3=new Thread(myThreadLock);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Window implements Runnable{
    int ticket = 1000;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run(){

        while(true){
            try{
                lock.lock();
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " |卖出去的票号：" +ticket--);
                }else{
                    break;
                }
            }finally{
                lock.unlock();
            }
        }
    }
}
class MyThreadLock implements Runnable {
    private static int ticket;

    public void setTicket(int ticket) {
        MyThreadLock.ticket = ticket;
    }

    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try{
                lock.lock();
                Thread.sleep(10);
                if (MyThreadLock.ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " |卖出去的票号：" + MyThreadLock.ticket);
                    MyThreadLock.ticket--;
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            if (MyThreadLock.ticket <= 0) {
                break;
            }
        }
    }
}


