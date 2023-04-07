package patterns.behavioral.command;

public class StartCommandExecutor implements CommandExecutor {
    MilitaryGeneral militaryGeneral;

    public StartCommandExecutor(MilitaryGeneral militaryGeneral) {
        this.militaryGeneral = militaryGeneral;
    }

    @Override
    public void execute() {
        militaryGeneral.start();
    }
}
