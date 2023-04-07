package patterns.behavioral.chain;

public class LineSupport {
    public static void main(String[] args) {
        Support firstLevel = new FirstLevelSupport(levelIssue.INFO);
        Support secondLevel = new SecondLevelSupport(levelIssue.WARN);
        Support thirdLevel = new ThirdLevelSupport(levelIssue.CLAIM);

        firstLevel.setNextSupport(secondLevel);
        secondLevel.setNextSupport(thirdLevel);

        firstLevel.supportManager("it's ok", levelIssue.INFO);
        firstLevel.supportManager("it's ok, but we have a some problem", levelIssue.WARN);
        firstLevel.supportManager("unfortunately we have a claim", levelIssue.CLAIM);
    }
}
