package javabase.interfacetest;

/**
 * @author tianqikai
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Network net = new ProxyServer(new RealServer());
        net.browse();
    }
}