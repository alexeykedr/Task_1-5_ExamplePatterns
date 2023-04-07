package patterns.structural.bridge;

public class WifiNetworkCreator {
    public static void main(String[] args) {
        Router routers[] = {
                new InputConnection(new Wifi2()),
                new OutputConnection(new Wifi1()),

        };


        for (Router router : routers) {
        router.connectRouter();
        }



    }
}
