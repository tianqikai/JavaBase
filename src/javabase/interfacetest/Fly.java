package javabase.interfacetest;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @ClassName：
 * @description:
 * @author: tianqikai
 * @date : 11:09 2021/5/4
 */
public interface Fly {
    //可以省略 public static final
    int SUM_TIME = 0;
    public static final int ID=119;
    //可以省略  public abstract
    void isFly();

    public abstract void isstop();
}
