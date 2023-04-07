package patterns.creational.Builder;

public class Car {
    private int price;
    private String name;
    private Kpp kpp;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKpp(Kpp kpp) {
        this.kpp = kpp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", kpp='" + kpp + '\'' +
                '}';
    }
}
