package patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Follower {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> bloggerEvents) {
        System.out.println("Dear "+ name + " we had an events:\n" +bloggerEvents +
                "\n=====================\n" );

    }
}
