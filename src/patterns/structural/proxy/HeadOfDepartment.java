package patterns.structural.proxy;

public class HeadOfDepartment implements Head{
    private String activity;

    public HeadOfDepartment(String activity) {
        this.activity = activity;
        make();
    }

    public void make() {
        System.out.println("Preparing action: " + activity);
    }

    @Override
    public void run() {
        System.out.println("Executing action: " + activity);

    }
}
