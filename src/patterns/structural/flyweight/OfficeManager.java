package patterns.structural.flyweight;

public class OfficeManager implements Manager{
    @Override
    public void doJob() {
        System.out.println("Office manager do something");
    }
}
