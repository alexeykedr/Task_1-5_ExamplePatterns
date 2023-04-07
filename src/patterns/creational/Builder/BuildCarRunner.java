package patterns.creational.Builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setCarBuilder(new TrackCarBuilder());
        Car car = director.buildCar();

        System.out.println(car);

    }
}
