package patterns.behavioral.observer;

public interface Blogger {
    public void addFollower (Follower follower);
    public void removeFollower (Follower follower);
    public void notifyFollowers();
}
