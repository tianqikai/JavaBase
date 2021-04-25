package javabase.overridetest;

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("吃猫粮");//猫喜欢吃猫粮
    }
    //非法，子类中的method1()的访问权限private比被覆盖方法的访问权限public小
//    @Override
//    private void eat() {
//        System.out.println("吃猫粮");//猫喜欢吃猫粮
//    }
}