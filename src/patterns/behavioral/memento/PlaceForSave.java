package patterns.behavioral.memento;

public class PlaceForSave {
    private SaveObject saveObject;

    public SaveObject getSaveObject() {
        return saveObject;
    }

    public void setSaveObject(SaveObject saveObject) {
        this.saveObject = saveObject;
    }

}
