package javabase.thread;
/**
 * @ClassName：
 * @description:
 * @author: tianqikai
 * @date : 16:09 2021/5/5
 * void start(): 启动线程，并执行对象的run()方法
 * run(): 线程在被调度时执行的操作
 * String getName(): 返回线程的名称
 * void setName(String name):设置该线程名称
 * static Thread currentThread(): 返回当前线程。在Thread子类中就是this，通常用于主线程和Runnable实现类
 * static void yield()：线程让步
 * 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
 * 若队列中没有同优先级的线程，忽略此方法
 * join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将
 * 被阻塞，直到 join() 方法加入的 join 线程执行完为止
 * 低优先级的线程也可以获得执行
 * static void sleep(long millis)：(指定时间:毫秒) 令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
 * 抛出InterruptedException异常
 * stop(): 强制线程生命期结束，不推荐使用
 * boolean isAlive()：返回boolean，判断线程是否还活着
 */
public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        //3. new 创建Thread子类对象，即创建了线程对象。
        Thread thread=new YourThread();
        thread.setName("子线程");//设置线程名称
        //4. 调用线程对象start方法：启动线程，调用当前线程的run方法。
        // 不能直接使用run方法启动子线程
        thread.start();
//        YourThread.sleep(5000);//令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
        Thread.currentThread().setName("主线程");
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+": 主线程main" + i);
            if(i==20){
                thread.join();//某个程序执行流中调用其他线程的 join() 方法时，调用线程将被阻塞，直到 join() 方法加入的 join 线程执行完为止
            }
        }
        System.out.println(thread.isAlive());//返回boolean，判断线程是否还活着
    }
}
// 1.定义子类继承Thread类
 class YourThread extends Thread{
    // 2.重写run方法
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            //getName()获取当前线程名称
            System.out.println(this.getName()+":子线程===="+i);
            if(i==60){
                yield();//线程让步  暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程,也可能还是自己本身这个线程
            }
        }
    }
}
