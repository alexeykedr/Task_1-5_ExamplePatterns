package patterns.behavioral.template;

public abstract class WallTemplate {
public void makeWall(){
    System.out.println("Top wall");
    showWall();
    System.out.println("Bottom wall");
        }
public abstract void showWall();
        }
