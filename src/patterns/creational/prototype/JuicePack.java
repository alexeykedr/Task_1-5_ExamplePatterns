package patterns.creational.prototype;

public class JuicePack implements Copyable{
    boolean isFull;
    String name;

    public boolean getIsFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JuicePack(boolean isFull, String name) {
        this.isFull = isFull;
        this.name = name;
    }

    @Override
    public Object copy() {
        JuicePack copy = new JuicePack(isFull, name);
        return copy;
    }

    @Override
    public String toString() {
        return "JuicePack{" +
                "isFull=" + isFull +
                ", name='" + name + '\'' +
                '}';
    }
}
