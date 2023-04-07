package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CustomerRunner {
    public static void main(String[] args) {
        ManagerFactory managerFactory = new ManagerFactory();

        List<Manager> managers = new ArrayList<>();

        managers.add(managerFactory.getManagerbySpecifiedName("sales"));
        managers.add(managerFactory.getManagerbySpecifiedName("sales"));
        managers.add(managerFactory.getManagerbySpecifiedName("sales"));
        managers.add(managerFactory.getManagerbySpecifiedName("sales"));
        managers.add(managerFactory.getManagerbySpecifiedName("sales"));
        managers.add(managerFactory.getManagerbySpecifiedName("office"));
        managers.add(managerFactory.getManagerbySpecifiedName("office"));
        managers.add(managerFactory.getManagerbySpecifiedName("office"));
        managers.add(managerFactory.getManagerbySpecifiedName("office"));
        managers.add(managerFactory.getManagerbySpecifiedName("office"));


        for (Manager manager : managers){
            manager.doJob();
        }


    }
}
