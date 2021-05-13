package javabase.execption;

import java.io.FileInputStream;

public class TestException {
    // throws抛异常
    public static void main(String[] args) throws Exception {
        boolean bool=true;
        //手工抛异常
        if (bool){
            throw new Exception("手工抛异常处理");
        }
        // try catch方式
        try{
            FileInputStream in = new FileInputStream("atguigushk.txt");
            int b; b = in.read();
            while (b != -1) {
                System.out.print((char) b);
                b = in.read();
            }
            in.close();
        }catch(RuntimeException re){
            System.out.println(re.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("最后处理！！！");
        }
    }

}
