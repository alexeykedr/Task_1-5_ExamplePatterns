package patterns.creational.Builder;

public class TrackCarBuilder extends CarBuilder{

    @Override
    void buildName() {
car.setName("VolvoTrack");
    }

    @Override
    void buildPrice() {
        car.setPrice(100_000);

    }

    @Override
    void buildKpp() {
        car.setKpp(Kpp.AUTO);

    }
}
