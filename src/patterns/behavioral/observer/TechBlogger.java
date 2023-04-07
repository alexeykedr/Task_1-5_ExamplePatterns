package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TechBlogger implements Blogger{
    List<String> bloggerEvents  = new ArrayList<>();
    List<Follower> followers  = new ArrayList<>();

    public void addEvent(String event){
        this.bloggerEvents.add(event);
        notifyFollowers();
    }
    public void removeEvent(String event){
        this.bloggerEvents.remove(event);
        notifyFollowers();
    }

    @Override
    public void addFollower(Follower follower) {
        this.followers.add(follower);

    }

    @Override
    public void removeFollower(Follower follower) {
        this.followers.remove(follower);

    }

    @Override
    public void notifyFollowers() {
        for (Follower follower : this.followers){
            follower.handleEvent(this.bloggerEvents);
        }

    }
}
