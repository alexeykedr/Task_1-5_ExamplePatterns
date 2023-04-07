package patterns.creational.Builder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildKpp();

    Car getCar(){
        return car;
    }
}
