package patterns.behavioral.visitor;

public class AreaRunner {
    public static void main(String[] args) {
        Area area = new Area();

        Manager internManager = new InternManager( );
        Manager expertManager = new ExpertManager();

        System.out.println("Intern in action");
       area.visit(internManager);

        System.out.println("\n================================================================\n");

        System.out.println("Expert in action");
        area.visit(expertManager);

    }
}
