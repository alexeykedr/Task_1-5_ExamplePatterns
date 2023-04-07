package patterns.creational.prototype;

public class JuicePackFactory {
    JuicePack juicePack;

    public JuicePackFactory(JuicePack juicePack) {
        this.juicePack = juicePack;
    }

    public void setJuicePack(JuicePack juicePack) {
        this.juicePack = juicePack;
    }

    JuicePack cloneJuicePack() {
        return (JuicePack) juicePack.copy();
    }
}
