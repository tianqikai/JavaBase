package javabase.supertest;

class Dog extends Animal {

    public String name = "旺财";

    @Override
    public void eat() {
        System.out.println("吃狗粮");//狗喜欢吃狗粮
    }

    public void m1(){

        System.out.println(super.name);//调用父类中的name变量
        System.out.println(this.name);//可以不加this，系统默认调用子类自己的name
        super.eat();//调用父类中的eat方法
        this.eat();
        eat();//调用本类的方法
    }
}