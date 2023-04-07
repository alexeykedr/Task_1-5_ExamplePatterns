package patterns.creational.factoryMethod;

public class TshirtManufacturer implements Manufacturer{
    @Override
    public void makeProduct() {
        System.out.println("T-shirt is made");
    }
}
