package javabase.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：
 * @description:
 * @author: tianqikai
 * @date : 22:45 2021/5/7
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        updateList(list);
        System.out.println(list);
        System.out.println("----------------");
        list.set(1,5);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.indexOf("222"));
        //内部还是用的迭代器
        for(Integer i:list){
            System.out.println(i);
        }
    }
    private static void updateList(List list) {
        list.remove(2);//按下标remove 所以3被移除
    }
}

