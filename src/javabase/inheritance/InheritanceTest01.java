package javabase.inheritance;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Student student=new Student();
//        student.earthFlag=true; 子类不能直接访问父类私有成员变量和方法
        student.setEarthFlag(false);
        System.out.println(student.getEarthFlag());
    }
}
