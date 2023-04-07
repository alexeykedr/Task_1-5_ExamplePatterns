package patterns.behavioral.command;

public class TurnLeftCommandExecutor implements CommandExecutor {
    MilitaryGeneral militaryGeneral;

    public TurnLeftCommandExecutor(MilitaryGeneral militaryGeneral) {
        this.militaryGeneral = militaryGeneral;
    }

    @Override
    public void execute() {
        militaryGeneral.turnLeft();
    }
}
