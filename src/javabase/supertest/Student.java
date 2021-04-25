package javabase.supertest;
/**
 * @ClassName：Student
 * @description: 学生实体
 * @author: tianqikai
 */
public class Student extends Person{
    public int id;
    public String name;
    public int grade;
    public int Class;

    public  Student(String name, int age,boolean isMale,int Class){
        super( name+"super",age,isMale);//super可用于在子类构造器中调用父类的构造器
        this.Class=Class;
        this.name=name;
    }

    public void getInfo() {
        System.out.println(super.name);//super可用于访问父类中定义的属性
        System.out.println(this.name);
        System.out.println(super.toString());//super可用于调用父类中定义的成员方法
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", Class=" + Class +
                ", name='" + super.name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
