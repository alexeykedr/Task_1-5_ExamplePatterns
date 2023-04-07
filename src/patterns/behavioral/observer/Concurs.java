package patterns.behavioral.observer;

public class Concurs {
    public static void main(String[] args) {
        TechBlogger techBlogger = new TechBlogger();

        techBlogger.addEvent("1st event");
        techBlogger.addEvent("2nd event");

        Follower firstFollower = new Subscriber("Ivan111");
        Follower secondFollower = new Subscriber("Alex222");

        techBlogger.addFollower(firstFollower);
        techBlogger.addFollower(secondFollower);

        techBlogger.addEvent("3rd event");

        techBlogger.removeEvent("3rd event");

    }
}
