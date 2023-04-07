package patterns.structural.decorator;

public class ElectricCarCanFlyAndSwim extends CarDecorator{
    public ElectricCarCanFlyAndSwim(Car car) {
        super(car);
    }

    public String addSwimOption(){
        return " and swim";
    }

    @Override
    public String getState() {
        return super.getState() + addSwimOption();
    }
}
