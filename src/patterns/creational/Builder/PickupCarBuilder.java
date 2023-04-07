package patterns.creational.Builder;

public class PickupCarBuilder extends CarBuilder{
    @Override
    void buildName() {
car.setName("DodgeRAM");
    }

    @Override
    void buildPrice() {
        car.setPrice(50_000);

    }

    @Override
    void buildKpp() {
        car.setKpp(Kpp.MANUAL);

    }
}
