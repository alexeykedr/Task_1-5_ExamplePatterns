package patterns.behavioral.command;

public class MilitaryColonel {
    CommandExecutor start;
    CommandExecutor stop;
    CommandExecutor turnLeft;
    CommandExecutor turnRight;

    public MilitaryColonel(CommandExecutor start, CommandExecutor stop, CommandExecutor turnLeft, CommandExecutor turnRight) {
        this.start = start;
        this.stop = stop;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
    }
    public void startRecord() {
        start.execute();
    }
    public void stopRecord() {
        stop.execute();
    }
    public void turnLeftRecord() {
        turnLeft.execute();
    }
    public void turnRightRecord() {
        turnRight.execute();
    }

}
