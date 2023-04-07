package patterns.structural.decorator;

public class StateCar {
    public static void main(String[] args) {
        Car car = new ElectricCarCanFlyAndSwim(new ElectricCarCanFly(new BaseCar()));

        System.out.println(car.getState());
    }
}
