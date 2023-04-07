package patterns.behavioral.state;

public class MyDogDay {
    public static void main(String[] args) {
        Activity activity = new Eating();
        MyDog myDog = new MyDog();

        myDog.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            myDog.doActivity();
            myDog.changeActivity();

        }
    }
}
