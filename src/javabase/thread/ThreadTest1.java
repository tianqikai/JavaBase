package javabase.thread;
/**
 * @ClassName：ThreadTest1
 * @description:
 * @author: tianqikai
 * @date : 15:18 2021/5/5
 */

public class ThreadTest1 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
