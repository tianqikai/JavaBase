package javabase.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName： CollectionTest
 * @description: 测试
 * @author: tianqikai
 * @date : 22:08 2021/5/7
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
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
        System.out.println("---------------------------");
        list.remove("444");
        list.remove(3);
        Iterator iterator2=list.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("--------------");
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.indexOf("222"));
        System.out.println(list.isEmpty());
        for(String str:list){
            System.out.println("value:"+str);
        }

    }
}
