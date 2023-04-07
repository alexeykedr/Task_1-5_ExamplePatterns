package patterns.creational.prototype;

public class JuicePackRunner {
    public static void main(String[] args) {
        JuicePack juicePack = new JuicePack(true,"Apple juice");
        System.out.println(juicePack);

JuicePackFactory juicePackFactory = new JuicePackFactory(juicePack);
JuicePack juicePackCopy = juicePackFactory.cloneJuicePack();
        System.out.println(juicePackCopy);

    }
}
