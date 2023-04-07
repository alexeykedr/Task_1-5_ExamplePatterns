package patterns.behavioral.command;

public class MilitaryGeneralRunner {
    public static void main(String[] args) {
        MilitaryGeneral militaryGeneral = new MilitaryGeneral();

        MilitaryColonel militaryColonel = new MilitaryColonel(
                new StartCommandExecutor(militaryGeneral),
                new StopCommandExecutor(militaryGeneral),
                new TurnLeftCommandExecutor(militaryGeneral),
                new TurnRightCommandExecutor(militaryGeneral)
        );

        militaryColonel.startRecord();
        militaryColonel.stopRecord();
        militaryColonel.turnLeftRecord();
        militaryColonel.turnRightRecord();

    }
}
