package patterns.structural.bridge;

public abstract class Router {
    protected Connection connection;

    protected Router(Connection connection) {
        this.connection = connection;
    }

    public abstract void connectRouter();

}
