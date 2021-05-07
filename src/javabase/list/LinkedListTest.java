package javabase.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName：
 * @description:
 * @author: tianqikai
 * @date : 21:36 2021/5/7
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("000");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println("value:"+iterator.next());
        }
        System.out.println("--------------------");
        list.removeFirst();
        list.removeLast();
        for (String str: list){
            System.out.println("value:"+str);
        }
    }
}
