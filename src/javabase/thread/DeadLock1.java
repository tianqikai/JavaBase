package javabase.thread;
/**
 * @ClassName：死锁测试
 * @description:
 * @author: tianqikai
 * @date : 21:45 2021/5/5
 */
public class DeadLock1 {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        StringBuffer b=new StringBuffer();
        new Thread(){
            @Override
            public void run() {
                synchronized (a){
                    a.append("a");
                    b.append("1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(b){
                        a.append("b");
                        b.append("2");
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("1");
                    a.append("c");
                    b.append("3");
                    System.out.println("aa:"+a.toString());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(a){
                        System.out.println("2");
                        a.append("d");
                        System.out.println("aaa:"+a.toString());
                        b.append("4");
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
