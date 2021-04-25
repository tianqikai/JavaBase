package javabase.pojo;
/**
 * @ClassName：Student
 * @description: 学生实体
 * @author: tianqikai
 */
public class Student {
    public int id;
    public String name;
    public int grade;
    public int Class;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", Class=" + Class +
                '}';
    }
}
