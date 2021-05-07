package javabase.interfacetest;
/**
 * @ClassName：Network
 * @description:
 * @author: tianqikai
 * @date : 21:02 2021/5/4
 */

interface Network {
    public void browse();
}
// 被代理类
class RealServer implements Network {
    @Override
    public void browse() {
        System.out.println("真实服务器上网浏览信息");
    }
}
// 代理类
class ProxyServer implements Network {
    private Network network;
    public ProxyServer(Network network) {
        this.network = network; }
    public void check() {
        System.out.println("检查网络连接等操作");
    }
    @Override
    public void browse() {
        check();
        network.browse();
    }
}
