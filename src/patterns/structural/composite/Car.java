package patterns.structural.composite;

public class Car {
    public static void main(String[] args) {
        WehicleBody wehicleBody = new WehicleBody();

        CarDoor LeftDoor = new LeftDoor();
        CarDoor RightDoor = new RightDoor();

        wehicleBody.addCarDoor(LeftDoor);
        wehicleBody.addCarDoor(RightDoor);

        wehicleBody.createCar();




    }
}
