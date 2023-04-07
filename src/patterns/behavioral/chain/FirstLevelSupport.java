package patterns.behavioral.chain;

public class FirstLevelSupport extends Support {

    public FirstLevelSupport(int levelIssue) {
        super(levelIssue);
    }

    @Override
    public void addInfo(String message) {
        System.out.println("Specialist 1 lvl add description: " + message);

    }
}
