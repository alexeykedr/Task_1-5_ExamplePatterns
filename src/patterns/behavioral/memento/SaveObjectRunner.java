package patterns.behavioral.memento;

public class SaveObjectRunner {
    public static void main(String[] args) {
        TextProject project = new TextProject();
        PlaceForSave placeForSave = new PlaceForSave();

        System.out.println("Creating new version SaveObject");
        project.setVersion("1.0v");

        System.out.println(project);

        System.out.println("version on PlaceForSave");
        placeForSave.setSaveObject(project.saveObject());

        System.out.println("update version to 1.1v");
        System.out.println("  make mistakes in text..");

        project.setVersion("1.1");

        System.out.println(project);

        System.out.println("we have a few mistakes");

        System.out.println("undo recent changes");
        project.loadObject(placeForSave.getSaveObject());

        System.out.println("SaveObject after undo changes");
        System.out.println(project);

    }
}
