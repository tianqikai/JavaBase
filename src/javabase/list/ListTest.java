package javabase.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName：
 * @description:
 * @author: tianqikai
 * @date : 15:49 2021/5/9
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        System.out.println(list);

        HashSet hashSet=new HashSet();
        hashSet.addAll(list);

        System.out.println(new ArrayList<>(hashSet));
        list.clear();
        list.addAll(hashSet);
        System.out.println(list);
    }
}
