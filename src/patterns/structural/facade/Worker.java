package patterns.structural.facade;

public class Worker {
    public void doWorkInProduction(ProductionAtManufactory productionAtManufactory){
        if(productionAtManufactory.isActiveProduction()){
            System.out.println("Worker do job in production");
        } else {
            System.out.println("Worker is resting");
        }
    }
}
