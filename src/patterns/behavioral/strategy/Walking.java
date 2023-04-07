package patterns.behavioral.strategy;


public class Walking implements Activity {
    @Override
    public void doActivity() {
        System.out.println("Walking...");
    }
}
