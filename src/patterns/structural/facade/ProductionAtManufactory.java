package patterns.structural.facade;

public class ProductionAtManufactory {
    private boolean activeProduction;

    public boolean isActiveProduction() {
        return activeProduction;
    }

    public void startProduction() {
        System.out.println("Production started");
        activeProduction = true;
    }

    public void stopProduction() {
        System.out.println("Production stopped");
        activeProduction = false;
    }

}
