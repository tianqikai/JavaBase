package javabase.map;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

/**
 * @ClassName：MapTest
 * @description:
 * @author: tianqikai
 * @date : 17:27 2021/5/9
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap map=new HashMap(16);
        HashMap map2=new HashMap(16);
        map.put(1,"xiaoming1");
        map.put(2,"xiaoming2");
        map.put(3,"xiaoming3");
        map.put(4,"xiaoming4");
        map.put(4,"xiaoming5");//key=4的位置上 value值变为xiaoming5
        map.put(5,"xiaoming6");
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("xiaoming5"));
        map.clear();
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map2.size());
        map2.remove(1);
        map2.replace(2,"xiaoming2","小明2");
        map2.replace(3,"小明3");
        System.out.println(map2);
        System.out.println(map.isEmpty());
        Set keys=map2.keySet();
        Set entrys=map2.entrySet();
        Collection values=map2.values();
        System.out.println("---------------------");
        for(Object key:keys){
            System.out.println("key:"+key+"value:"+map2.get(key));
        }
        System.out.println("---------------------");
        for (Object mapping:entrys){
            Map.Entry entry = (Map.Entry) mapping;
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
        Iterator iterator=map2.keySet().iterator();
        System.out.println("---------------------");
        while(iterator.hasNext()){
            int key=(Integer) iterator.next();
            System.out.println("key:"+key+"value:"+map2.get(key));
        }
    }
}
