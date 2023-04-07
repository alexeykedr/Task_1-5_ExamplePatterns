package patterns.behavioral.visitor;

public class ResidentialHouse implements ProjectElement{
    @Override
    public void visit(Manager manager) {
        manager.visitPlace(this);


    }
}
