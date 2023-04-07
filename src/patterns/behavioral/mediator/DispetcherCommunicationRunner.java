package patterns.behavioral.mediator;

public class DispetcherCommunicationRunner {
    public static void main(String[] args) {
        DispetcherCommunication dispetcherCommunication
                = new DispetcherCommunication();

        Airplane boing777 = new Boing777(dispetcherCommunication,"boing777");
        Airplane anotherPlane1 = new AnotherPlane(dispetcherCommunication,"anotherPlane_1");
        Airplane anotherPlane2 = new AnotherPlane(dispetcherCommunication,"anotherPlane_2");
        Airplane anotherPlane3 = new AnotherPlane(dispetcherCommunication,"anotherPlane_3");

        dispetcherCommunication.setBoing777(boing777);
        dispetcherCommunication.addAirplane(anotherPlane1);
        dispetcherCommunication.addAirplane(anotherPlane2);
        dispetcherCommunication.addAirplane(anotherPlane3);

        anotherPlane1.sendMessage("i'm anotherPlane_1");
    }
}
