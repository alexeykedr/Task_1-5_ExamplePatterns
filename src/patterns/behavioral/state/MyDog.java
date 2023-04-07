package patterns.behavioral.state;

public class MyDog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Eating){
            setActivity(new Guarding());
        } else if (activity instanceof Guarding){
            setActivity(new Sleeping());
        } else if (activity instanceof Sleeping){
            setActivity(new Walking());
        } else if (activity instanceof Walking){
            setActivity(new Eating());
        }
    }

    public void doActivity(){
        activity.doActivity();
    }
}
