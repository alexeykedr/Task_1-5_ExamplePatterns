package patterns.creational.abstractFactory;

public interface SalesDepartmentFactory {
    Director getDirector();
    SalesManager getSalesManager();
    OfficeManager getOfficeManager();
}
