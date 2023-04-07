package patterns.creational.factoryMethod;

public class TshirtManufacturerFactory implements ManufacturerFactory{
    @Override
    public Manufacturer createManufacturer() {
        return new TshirtManufacturer();
    }
}

