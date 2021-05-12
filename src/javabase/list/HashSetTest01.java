package javabase.list;
/**
 * @ClassName：HashSetTest01
 * @description:
 * @author: tianqikai
 * @date : 15:53 2021/5/9
 */

import java.util.HashSet;

public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        User p1 = new User("AA",18);
        User p2 = new User("BB",19);
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set); //输出结果是两个对象，原因是 p1属性质改变后，他的hashcode也改变了，这时候进行remove，他在底层数组上找到的不是真正存储p1的位置，所以p1没有被删掉
        set.add(new User("CC",18));
        System.out.println(set);//输出三个对象，第三个对象计算出来的位置，和原来的p1的位置不冲突
        set.add(new User("AA",14)); //存在p1位置的链表上
        System.out.println(set);
    }
}
