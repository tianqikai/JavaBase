package javabase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName：CallableThread
 * @description:
 * @author: tianqikai
 * @date : 21:57 2021/5/6
 */
public class CallableThread {
    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
        myCallable.setTicket(100);

        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
        FutureTask<Integer> futureTask1 = new FutureTask<Integer>(myCallable);
        new Thread(futureTask).start();
        new Thread(futureTask1).start();
        try {
            Integer value = futureTask.get();
            System.out.println("返回值："+value);
            Integer value1 = futureTask1.get();
            System.out.println("返回值1："+value1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class MyCallable implements Callable<Integer>{
    private  int ticket;

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public Integer call() throws Exception {
        while(true){
            synchronized(this){
                if (this.ticket>0){
                    System.out.println(Thread.currentThread().getName()+" |卖出去的票号："+this.ticket);
                    this.ticket--;
                }else{
                    break;
                }
            }
        }
        return 200;
    }
}
