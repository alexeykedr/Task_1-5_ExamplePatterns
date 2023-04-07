package patterns.structural.adapter;

public class AdapterMemoryCardToUSB extends MemoryCard implements USB {
    @
            Override
    public void getData() {
        read();
    }

    @Override
    public void giveData() {
        write();
    }
}
