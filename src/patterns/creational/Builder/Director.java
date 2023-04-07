package patterns.creational.Builder;

public class Director {
    CarBuilder carBuilder;

    public  void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildKpp();
        carBuilder.buildPrice();

        Car car  = carBuilder.getCar();
        return car;
    }
}
