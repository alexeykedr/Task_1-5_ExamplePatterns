package patterns.structural.bridge;

public class Wifi1 implements Connection{
    @Override
    public void makeConnect() {
        System.out.println("Wifi1 connected");
    }
}
