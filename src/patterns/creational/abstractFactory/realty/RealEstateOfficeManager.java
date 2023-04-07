package patterns.creational.abstractFactory.realty;

import patterns.creational.abstractFactory.OfficeManager;

public class RealEstateOfficeManager implements OfficeManager {
    @Override
    public void registerDeals() {
        System.out.println("Real Estate Office Manager registers deals");
    }
}
