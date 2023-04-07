package patterns.behavioral.visitor;

public class Hospital implements ProjectElement{
    @Override
    public void visit(Manager manager) {
        manager.visitPlace(this);

    }
}
