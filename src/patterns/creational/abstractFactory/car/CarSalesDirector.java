package patterns.creational.abstractFactory.car;

import patterns.creational.abstractFactory.Director;

public class CarSalesDirector implements Director {
    @Override
    public void manageTeam() {
        System.out.println("Car Sales Director manages team");
    }
}
