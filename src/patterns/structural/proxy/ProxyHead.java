package patterns.structural.proxy;

public class ProxyHead implements Head {
    private String activity;
    private HeadOfDepartment headOfDepartment;

    public ProxyHead(String activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        if (headOfDepartment == null) {
            headOfDepartment = new HeadOfDepartment(activity);
        }
        headOfDepartment.run();
    }
}
