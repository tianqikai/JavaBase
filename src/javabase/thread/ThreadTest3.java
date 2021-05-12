package javabase.thread;
/**
 * @ClassName：ThreadTest3
 * @description: 线程优先级
 * @author: tianqikai
 * @date : 16:32 2021/5/5
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        //3. new 创建Thread子类对象，即创建了线程对象。
        Thread thread=new MyThread3();
        //4. 调用线程对象start方法：启动线程，调用当前线程的run方法。
        // 不能直接使用run方法启动子线程
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getName()+"优先级:"+thread.getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName()+"优先级:"+thread.getPriority());
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+": 主线程main" + i);
        }
    }
}
// 1.定义子类继承Thread类
class MyThread3 extends Thread{
    // 2.重写run方法
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":子线程===="+i);
        }
    }
}
