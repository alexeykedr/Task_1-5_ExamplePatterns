package patterns.behavioral.command;

public class StopCommandExecutor implements CommandExecutor {
    MilitaryGeneral militaryGeneral;

    public StopCommandExecutor(MilitaryGeneral militaryGeneral) {
        this.militaryGeneral = militaryGeneral;
    }

    @Override
    public void execute() {
        militaryGeneral.stop();
    }
}
