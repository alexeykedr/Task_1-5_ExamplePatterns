package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ManagerFactory {
    private static final Map<String, Manager> managers = new HashMap<>();

    public Manager getManagerbySpecifiedName(String name) {
        Manager manager = managers.get(name);

        if (manager == null){
            switch (name){
                case "office":
                    System.out.println(" Calling office-manager");
                    manager = new OfficeManager();
                    break;
                case "sales":
                    System.out.println(" Calling sales-manager");
                    manager = new SalesManager();
            }
            managers.put(name, manager);
        }
        return manager;
    }
}
