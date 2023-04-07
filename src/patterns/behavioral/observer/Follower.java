package patterns.behavioral.observer;

import java.util.List;

public interface Follower {
    public void handleEvent(List<String> bloggerEvents);
}
