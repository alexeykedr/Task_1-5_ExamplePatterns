package patterns.structural.flyweight;

public class SalesManager implements Manager{
    @Override
    public void doJob() {
        System.out.println("Sales manager do something");
    }
}
