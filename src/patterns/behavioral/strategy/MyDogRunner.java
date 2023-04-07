package patterns.behavioral.strategy;

public class MyDogRunner {
    public static void main(String[] args) {
        MyDog myDog = new MyDog();

        myDog.setActivity( new Sleeping());
        myDog.executeActivity();

        myDog.setActivity(new Walking());
        myDog.executeActivity();

        myDog.setActivity(new Eating());
        myDog.executeActivity();

        myDog.setActivity(new Guarding());
        myDog.executeActivity();

        myDog.setActivity(new Sleeping());
        myDog.executeActivity();
    }
}
