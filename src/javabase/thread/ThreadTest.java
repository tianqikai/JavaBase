package javabase.thread;
/**
 * @ClassName：ThreadTest
 * @description: 多线程test
 * @author: tianqikai
 * @date : 14:49 2021/5/5
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3. new 创建Thread子类对象，即创建了线程对象。
        Thread thread=new MyThread();
        //4. 调用线程对象start方法：启动线程，调用当前线程的run方法。
        // 不能直接使用run方法启动子线程
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+": 主线程main" + i);
        }
    }
}
