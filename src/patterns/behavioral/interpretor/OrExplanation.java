package patterns.behavioral.interpretor;

public class OrExplanation implements Explanation {
    Explanation explanation1;
    Explanation explanation2;

    public OrExplanation(Explanation explanation1, Explanation explanation2) {
        this.explanation1 = explanation1;
        this.explanation2 = explanation2;
    }

    @Override
    public boolean interpret(String description) {
        return explanation1.interpret(description) || explanation2.interpret(description);
    }
}
