package patterns.structural.adapter;

public class MemoryCardRunner {
    public static void main(String[] args) {
        USB usb = new AdapterMemoryCardToUSB();

        usb.getData();
        usb.giveData();
    }

}
