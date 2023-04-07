package patterns.creational.factoryMethod;

public class ShirtManufacturerFactory implements ManufacturerFactory {
    @Override
    public Manufacturer createManufacturer() {
        return new ShirtManufacturer();
    }
}
