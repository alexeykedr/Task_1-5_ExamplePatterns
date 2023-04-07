package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WehicleBody {
    private List<CarDoor> doors = new ArrayList<>();

    public void addCarDoor(CarDoor carDoor) {
        doors.add(carDoor);
    }

    public void removeCarDoor(CarDoor carDoor) {
        doors.remove(carDoor);
    }

    public void createCar() {
        System.out.println("WehicleBody is created for Car");
        for (CarDoor carDoor : doors) {
            carDoor.isHas();
        }
    }
}
