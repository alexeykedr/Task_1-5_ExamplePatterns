package patterns.behavioral.interpretor;

public class TermExplanation implements Explanation {
    private String data;

    public TermExplanation(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String description) {
        if(description.contains(data)){
            return true;
        }
        return false;
    }
}
