package javabase.test.java8;

import javabase.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdbaTest {
    @Test
    public void method1(){
        Runnable runnable=()-> System.out.println("无参无返回的lamdba表达式！");
        runnable.run();
    }

    @Test
    public void method2(){
        //消费型
        Consumer consumer1=(str)-> System.out.println("有参无返回值得Lamdba表达式"+str);
        Consumer consumer2=(str)-> System.out.println("有参无返回值得Lamdba表达式"+str);
        consumer1.accept("小明");
        consumer2.accept("小花");
        //断言式
        Predicate<Integer> predicate=(Integer num)->{
            int n=Integer.compare(num,1000);
            if(n<0){
                System.out.println("小于1000"+"有参数有返回值多行");
                return true;
            }else{
                System.out.println("大于等于1000"+"有参数有返回值多行");
                return false;
            }
        };
        predicate.test(999);
    }

    @Test
    public void method3(){
        //供给型
        Supplier<Boolean> supplier=()-> {
            System.out.println("供给式");
            return true;
        };
        supplier.get();
    }

    @Test
    public void method4(){

        //函数型
        Function<List,String> func=(s1)-> {
            StringBuffer stringBuffer=new StringBuffer();

            s1.stream().forEach(s->stringBuffer.append(s));

            System.out.println("供给式");
            return stringBuffer.toString();
        };
        List<String> list = new ArrayList<>();
        list.add("小花花");
        list.add("小飘飘");
        list.add("小美美");
        System.out.println(func.apply(list));
    }
    //Stream api

    @Test
    public void method5(){
        String[] strings = new java.lang.String[]{"小花花","小飘飘","小美美","小刚刚"};
        Arrays.asList(strings).stream().filter((str)->!str.contains("刚")).forEach((str)-> System.out.println(str+",你好漂亮，我好喜欢你！"));
    }

    @Test
    public void method6(){
        List<String> list = new ArrayList<>();
        list.add("小花花");
        list.add("小飘飘");
        list.add("小美美");
        list.add("小刚刚");
        list.add("小靓靓");
        list.add("小靓靓");
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("--------------------------------");
        list.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("---------------------------------");
        list.stream().limit(2).forEach(s-> System.out.println(s));
        list.stream().skip(2).forEach(s-> System.out.println(s));
    }

    @Test
    public void method7(){
        Person person = new Person();
        person=null;
        Optional.ofNullable(person).orElse(person=new Person("小花花"));
        System.out.println(person.toString());

    }


}
