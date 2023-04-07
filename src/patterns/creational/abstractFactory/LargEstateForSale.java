package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.realty.RealEstateSalesDepartmentFactory;

public class LargEstateForSale {
    public static void main(String[] args) {
        SalesDepartmentFactory salesDepartmentFactory = new RealEstateSalesDepartmentFactory();
        Director director = salesDepartmentFactory.getDirector();
        OfficeManager officeManager = salesDepartmentFactory.getOfficeManager();
        SalesManager salesManager = salesDepartmentFactory.getSalesManager();

        System.out.println("Estate is selling");
        director.manageTeam();
        salesManager.makeDeals();
        officeManager.registerDeals();
    }
}
