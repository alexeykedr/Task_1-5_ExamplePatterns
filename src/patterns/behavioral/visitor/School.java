package patterns.behavioral.visitor;

public class School implements ProjectElement{
    @Override
    public void visit(Manager manager) {
        manager.visitPlace(this);


    }
}
