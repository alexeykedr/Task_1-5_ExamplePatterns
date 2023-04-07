package patterns.behavioral.strategy;

public class MyDog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doActivity();
    }
}
