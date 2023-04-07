package patterns.structural.decorator;

public class BaseCar implements Car{
    @Override
    public String getState() {
        return "Just electric car";
    }
}
