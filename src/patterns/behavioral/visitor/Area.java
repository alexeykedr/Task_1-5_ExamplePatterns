package patterns.behavioral.visitor;

public class Area implements ProjectElement {
    ProjectElement[] projectElements;

    public Area() {
        this.projectElements = new ProjectElement[]{
                new Hospital(),
                new ResidentialHouse(),
                new School()
        };
    }

    @Override
    public void visit(Manager manager) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.visit(manager);
        }

    }
}
