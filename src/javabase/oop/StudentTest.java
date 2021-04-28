package javabase.oop;

import javabase.pojo.Student;

/**
 * @ClassName：StudentTest
 * @description: Student测试类
 * @author: tianqikai
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.id=1001;
        s.name="小明";
        s.grade=3;
        s.Class=21;

        System.out.println(s.toString());
    }
}
