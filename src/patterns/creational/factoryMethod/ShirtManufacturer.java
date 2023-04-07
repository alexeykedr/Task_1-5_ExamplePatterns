package patterns.creational.factoryMethod;

public class ShirtManufacturer implements Manufacturer{
    @Override
    public void makeProduct() {
        System.out.println("Shirt is made");
    }
}
