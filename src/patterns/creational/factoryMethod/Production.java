package patterns.creational.factoryMethod;

public class Production {
    public static void main(String[] args) {
ManufacturerFactory manufacturerFactory = createSpecificProduct("t-shirt");
Manufacturer manufacturer = manufacturerFactory.createManufacturer();

manufacturer.makeProduct();
    }

    static ManufacturerFactory createSpecificProduct(String productName){
        if(productName.equals("t-shirt")) return new TshirtManufacturerFactory();
        if(productName.equals("shirt")) return new ShirtManufacturerFactory();
        if (productName.equals("socks")) return new SocksManufacturerFactory();
        else throw new RuntimeException(productName + " is not exist");

    }

}
