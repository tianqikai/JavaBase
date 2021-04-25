package javabase.inheritance;

import java.util.Date;

public class Person {
    public String name;
    public int age;
    public Date birthDate;
    private boolean earthFlag;

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public boolean getEarthFlag(){
        return earthFlag;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEarthFlag(boolean earthFlag) {
        this.earthFlag = earthFlag;
    }

    public void setName(String name) {
        this.name = name;
    }
}

