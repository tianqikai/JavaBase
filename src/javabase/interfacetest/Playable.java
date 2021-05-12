package javabase.interfacetest;

interface Playable {
    void play();
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable, 
Bounceable {
    Ball ball = new Ball("PingPang");
}
class Ball implements Rollable {
    private String name;
    public String getName() {
        return name;
    }
    public Ball(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        // ball 接口中ball是常量，使用 public static  final修饰的无法修改
//        ball = new Ball("Football");
        System.out.println(ball.getName());
    }
}