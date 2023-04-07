package patterns.creational.abstractFactory.car;

import patterns.creational.abstractFactory.OfficeManager;

public class CarOfficeManager implements OfficeManager {
    @Override
    public void registerDeals() {
        System.out.println("Car office manager registers deals");
    }
}
