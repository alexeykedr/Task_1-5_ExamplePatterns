package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class DispetcherCommunication implements Dispetcher {
    Airplane boing777;
    List<Airplane> airplanes = new ArrayList<>();

    public void setBoing777(Airplane boing777) {
        this.boing777 = boing777;
    }

    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }


    @Override
    public void sendMessage(String message, Airplane airplane) {

        for (Airplane plane : airplanes) {
            if (plane != airplane) {
                plane.getMessage(message);
            }
        }
        boing777.getMessage(message);

    }
}
