package patterns.structural.proxy;

public class HeadActionRunner {
    public static void main(String[] args) {
        Head head  = new ProxyHead("conference");

        head.run();
    }
}
