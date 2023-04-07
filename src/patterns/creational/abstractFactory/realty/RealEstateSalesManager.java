package patterns.creational.abstractFactory.realty;

import patterns.creational.abstractFactory.SalesManager;

public class RealEstateSalesManager implements SalesManager {

    @Override
    public void makeDeals() {
        System.out.println("Real Estate Sales Manager makes deals");

    }
}
