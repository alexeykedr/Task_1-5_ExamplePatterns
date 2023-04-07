package patterns.behavioral.visitor;

public interface Manager {
    public void visitPlace(Hospital hospital);
    public void visitPlace(ResidentialHouse residentialHouse);
    public void visitPlace(School school);
}
