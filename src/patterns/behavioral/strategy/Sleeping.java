package patterns.behavioral.strategy;



public class Sleeping implements Activity {
    @Override
    public void doActivity() {
        System.out.println("Sleeping...");
    }
}
