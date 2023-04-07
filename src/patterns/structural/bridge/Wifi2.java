package patterns.structural.bridge;

public class Wifi2 implements Connection{
    @Override
    public void makeConnect() {
        System.out.println("Wifi2 connected");
    }
}
