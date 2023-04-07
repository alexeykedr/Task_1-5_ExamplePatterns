package patterns.creational.abstractFactory.car;

import patterns.creational.abstractFactory.Director;
import patterns.creational.abstractFactory.OfficeManager;
import patterns.creational.abstractFactory.SalesDepartmentFactory;
import patterns.creational.abstractFactory.SalesManager;

public class CarSalesDepartmentFactory implements SalesDepartmentFactory {
    @Override
    public Director getDirector() {
        return new CarSalesDirector();
    }

    @Override
    public SalesManager getSalesManager() {
        return new CarSalesManager();
    }

    @Override
    public OfficeManager getOfficeManager() {
        return new CarOfficeManager();
    }
}
