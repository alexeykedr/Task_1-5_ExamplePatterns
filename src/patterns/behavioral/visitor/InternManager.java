package patterns.behavioral.visitor;

public class InternManager implements Manager{
    @Override
    public void visitPlace(Hospital hospital) {
        System.out.println("Visit Hospital staff");

    }

    @Override
    public void visitPlace(ResidentialHouse residentialHouse) {
        System.out.println("Visit ResidentialHouse staff");

    }

    @Override
    public void visitPlace(School school) {
        System.out.println("Visit School staff");


    }
}
