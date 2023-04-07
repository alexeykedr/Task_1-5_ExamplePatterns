package patterns.structural.decorator;

public class ElectricCarCanFly extends CarDecorator {
    public ElectricCarCanFly(Car car) {
        super(car);
    }

    public String additionalCarBehavior(){
        return " that can fly";
    }

    @Override
    public String getState() {
        return super.getState() + additionalCarBehavior();
    }
}
