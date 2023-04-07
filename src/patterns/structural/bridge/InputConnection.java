package patterns.structural.bridge;

public class InputConnection extends Router{


    protected InputConnection(Connection connection) {
        super(connection);
    }

    @Override
    public void connectRouter() {
        System.out.println("InputConnection is successfully");
        connection.makeConnect();

    }

}
