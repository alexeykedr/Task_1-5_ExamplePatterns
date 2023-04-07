package patterns.behavioral.mediator;

public class Boing777 implements Airplane{
    Dispetcher dispetcher;
    String name;

    public Boing777(Dispetcher dispetcher, String name) {
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
        dispetcher.sendMessage(message,this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }
}
