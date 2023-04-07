package patterns.behavioral.chain;

public class SecondLevelSupport extends Support{

    public SecondLevelSupport(int levelIssue) {
        super(levelIssue);
    }

    @Override
    public void addInfo(String message) {
        System.out.println("Specialist 2 lvl add tech-info: " + message);

    }
}
