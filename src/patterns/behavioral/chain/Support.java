package patterns.behavioral.chain;

public abstract class Support {
private int levelIssue;
private Support nextSupport;

    public Support(int levelIssue) {
        this.levelIssue = levelIssue;
    }

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }
    public void supportManager(String message, int level) {
        if (level>=levelIssue){
            addInfo(message);
        }
        if (nextSupport!=null){
            nextSupport.supportManager(message, level);
        }
    }
    public abstract void addInfo(String message);
}
