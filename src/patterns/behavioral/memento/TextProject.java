package patterns.behavioral.memento;

import java.util.Date;

public class TextProject {
    private String version;
    private Date date;

    public void setVersion(String version) {
        this.version = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "TextProject:" +
                "\n Version: " + version + '\'' +
                "\n Date: " + date + "\n";
    }

    public SaveObject saveObject (){
        return new SaveObject(version);
    }

    public void loadObject(SaveObject saveObject){
        version = saveObject.getVersion();
        date = saveObject.getDate();
    }
}
