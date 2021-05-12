package javabase.list;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName：TreeSetTest
 * @description:
 * @author: tianqikai
 * @date : 12:59 2021/5/9
 */
public class TreeSetTest {
    public static void main(String[] args) {
//        Method2();
        Method1();
    }
    //自然排序
    private static void Method2() {
        TreeSet treeSet=new TreeSet<>();
        //如果 User没有实现Comparable接口的话； 报错javabase.list.User cannot be cast to java.lang.Comparable
        treeSet.add(new User("C",12));
        treeSet.add(new User("B",12));
        treeSet.add(new User("B",22));
        treeSet.add(new User("DD",32));
        treeSet.add(new User("DD",12));
        treeSet.add(new User("CC",12));
        System.out.println(treeSet);
    }
    //定制排序 按年龄从小到大排序
    private static void Method1(){
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               if(o1 instanceof User && o2 instanceof User){
                    return  Integer.compare(((User) o1).getAge(),((User) o2).getAge());
               }else{
                   throw new RuntimeException ("比较类型不正确");
               }

            }
        };
        TreeSet treeSet=new TreeSet<>(comparator);
        treeSet.add(new User("C",12));
        treeSet.add(new User("B",12));
        treeSet.add(new User("B",22));
        treeSet.add(new User("DD",32));
        treeSet.add(new User("DD",12));
        treeSet.add(new User("CC",12));
        System.out.println(treeSet);
    }
}
