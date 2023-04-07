package patterns.structural.bridge;

public class OutputConnection extends Router{

    protected OutputConnection(Connection connection) {
        super(connection);
    }

    @Override
    public void connectRouter() {
        System.out.println("Output connection is successfully");
        connection.makeConnect();

    }


}
