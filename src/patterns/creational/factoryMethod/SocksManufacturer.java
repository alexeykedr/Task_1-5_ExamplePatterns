package patterns.creational.factoryMethod;

public class SocksManufacturer implements Manufacturer{
    @Override
    public void makeProduct() {
        System.out.println("Socks are made ");
    }
}
