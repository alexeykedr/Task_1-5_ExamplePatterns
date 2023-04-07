package patterns.creational.abstractFactory.realty;

import patterns.creational.abstractFactory.Director;

public class RealEstateSalesDirector implements Director {
    @Override
    public void manageTeam() {
        System.out.println("Real Estate Director manages team");
    }
}
