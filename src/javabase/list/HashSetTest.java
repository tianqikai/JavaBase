package javabase.list;

import java.util.HashSet;

/**
 * @ClassName：HashSetTest
 * @description:
 * @author: tianqikai
 * @date : 12:02 2021/5/9
 */
public class HashSetTest {
    public static void main(String[] args) {
        //不能保证元素的排列顺序
        HashSet hashSet=new HashSet();
        hashSet.add(456);
        //包装类，默认重写了equals和hashCode方法
        hashSet.add(new Integer("456"));
        hashSet.add(123);
        hashSet.add(123);
        //对应的类一定要重写equals()和hashCode(Objectobj)方法，以实现对象相等规则。即：“相等的对象必须具有相等的散列码”。
        hashSet.add(new User("小敏",18));
        hashSet.add(new User("小敏",18));
        System.out.println(hashSet);
    }
}
