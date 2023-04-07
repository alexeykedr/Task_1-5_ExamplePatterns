package patterns.behavioral.visitor;

public class ExpertManager implements Manager{
    @Override
    public void visitPlace(Hospital hospital) {
        System.out.println("Made a sale in Hospital staff");

    }

    @Override
    public void visitPlace(ResidentialHouse residentialHouse) {
        System.out.println("Made a sale in ResidentialHouse staff");


    }

    @Override
    public void visitPlace(School school) {
        System.out.println("Made a sale in School staff");


    }
}
