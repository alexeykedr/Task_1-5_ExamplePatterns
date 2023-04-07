package patterns.behavioral.chain;

public class ThirdLevelSupport extends Support{
    public ThirdLevelSupport(int levelIssue) {
        super(levelIssue);
    }

    @Override
    public void addInfo(String message) {
        System.out.println("Specialist 3 lvl solved issue: " + message);

    }
}
