package patterns.behavioral.template;

public class WallRunner {
    public static void main(String[] args) {
        WallTemplate wall1 = new Wall1();
        WallTemplate wall2 = new Wall2();

        wall1.makeWall();
        System.out.println("================================");
        wall2.makeWall();

    }
}
