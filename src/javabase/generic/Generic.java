package javabase.generic;

import javabase.pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        objectMethod();
        genericMethod();

    }

    private static void genericMethod() {
        List<Integer> list1=new ArrayList<Integer>();
        List<String> list2=new ArrayList<String>();
        List<Person> list3=new ArrayList<Person>();
        list1.add(1);
        list2.add("xm");
        Person person=new Person();
        person.name="111";
        person.age=11;
        list3.add(person);
    }

    private static void objectMethod() {
        List<Object> list=new ArrayList<Object>();
        list.add(1);
        list.add("xm");
        Person person=new Person();
        person.name="111";
        person.age=11;
        list.add(person);
        for (Object o : list) {
            if(o instanceof Integer||o instanceof String){
                System.out.println(o);
            }else if(o instanceof Person){
                System.out.println(o.toString());
            }
        }
    }
    private static <T> void objectMethod2() {
        List<T> list=new ArrayList<T>();
    }
}
