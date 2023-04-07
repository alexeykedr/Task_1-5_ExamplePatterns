package patterns.behavioral.mediator;

public class AnotherPlane implements Airplane {
    Dispetcher dispetcher;
    String name;

    public AnotherPlane(Dispetcher dispetcher, String name) {
        this.dispetcher = dispetcher;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        dispetcher.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " received message: " + message);

    }
}
