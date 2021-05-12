package javabase.thread;
/**
 * @ClassName：MyThread
 * @description:
 * @author: tianqikai
 * @date : 14:50 2021/5/5
 */
// 1.定义子类继承Thread类
public class MyThread extends Thread{
    // 2.重写run方法
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":子线程===="+i);
        }
    }
}
