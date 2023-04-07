package patterns.creational.abstractFactory.realty;

import patterns.creational.abstractFactory.Director;
import patterns.creational.abstractFactory.OfficeManager;
import patterns.creational.abstractFactory.SalesDepartmentFactory;
import patterns.creational.abstractFactory.SalesManager;

public class RealEstateSalesDepartmentFactory implements SalesDepartmentFactory {

    @Override
    public Director getDirector() {
        return new RealEstateSalesDirector();
    }

    @Override
    public SalesManager getSalesManager() {
        return new RealEstateSalesManager();
    }

    @Override
    public OfficeManager getOfficeManager() {
        return new RealEstateOfficeManager();
    }
}
