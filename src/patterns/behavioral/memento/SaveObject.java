package patterns.behavioral.memento;

import java.util.Date;

public class SaveObject {
    private final String version;
    private final Date date;

    public SaveObject(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
