package javabase.list;

import java.security.PrivateKey;
import java.util.Objects;

/**
 * @ClassName：User
 * @description:
 * @author: tianqikai
 * @date : 12:02 2021/5/9
 */
public class User implements  Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user=(User) o;
            int compare= this.name.compareTo(user.name);
            if(compare==0){
                compare=Integer.compare(this.age, user.age);
            }
            return compare;
        }else{
            throw new RuntimeException ("比较类型不正确");
        }
    }
}
