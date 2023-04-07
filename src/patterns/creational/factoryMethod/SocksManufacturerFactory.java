package patterns.creational.factoryMethod;

public class SocksManufacturerFactory implements ManufacturerFactory{
    @Override
    public Manufacturer createManufacturer() {
        return new SocksManufacturer();
    }
}
