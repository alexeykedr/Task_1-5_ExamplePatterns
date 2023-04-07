package patterns.structural.facade;

public class HiddenWorkFlow {
Worker worker = new Worker();
Manufactura manufactura = new Manufactura();
ProductionAtManufactory productionAtManufactory = new ProductionAtManufactory();

public void productionOfGoods(){
    manufactura.makeProduct();
    productionAtManufactory.startProduction();
    worker.doWorkInProduction(productionAtManufactory);
}
}
