package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.realty.RealEstateSalesDepartmentFactory;

public class BigOrderOfCarsForSale {
    public static void main(String[] args) {
        SalesDepartmentFactory salesDepartmentFactory = new RealEstateSalesDepartmentFactory();
        Director director = salesDepartmentFactory.getDirector();
        SalesManager salesManager = salesDepartmentFactory.getSalesManager();
        OfficeManager officeManager = salesDepartmentFactory.getOfficeManager();

        System.out.println("cars are selling");
        director.manageTeam();
        salesManager.makeDeals();
        officeManager.registerDeals();
    }
}
