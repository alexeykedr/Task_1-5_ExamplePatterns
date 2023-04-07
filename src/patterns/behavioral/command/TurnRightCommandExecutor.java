package patterns.behavioral.command;

public class TurnRightCommandExecutor implements CommandExecutor{
    MilitaryGeneral militaryGeneral;

    public TurnRightCommandExecutor(MilitaryGeneral militaryGeneral) {
        this.militaryGeneral = militaryGeneral;
    }

    @Override
    public void execute() {
        militaryGeneral.turnRight();

    }
}
