package structuralDesignPatterns.adapter.example3;

public class SDToUSBAdapter implements USB{
    private SDCard sdCard;

    public SDToUSBAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void connectWithUSB() {
        System.out.println("Adapter converts USB signal to SD card.");
        sdCard.insertIntoSDCardSlot();
    }
}
