package javabase.interfacetest;
/**
 * @ClassName：Runner
 * @description:
 * @author: tianqikai
 * @date : 20:41 2021/5/4
 */

public interface Runner extends Walk{
    /**
     * @Method： run
     * @Description：跑
     * @Date： 2021/5/4 20:42
     */
    public abstract void run();

    @Override
    void isWalk();
}
