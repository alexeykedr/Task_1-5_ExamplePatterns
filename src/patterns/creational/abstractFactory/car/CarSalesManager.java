package patterns.creational.abstractFactory.car;

import patterns.creational.abstractFactory.SalesManager;

public class CarSalesManager implements SalesManager {
    @Override
    public void makeDeals() {
        System.out.println("Car sales manager makes deals");
    }
}
