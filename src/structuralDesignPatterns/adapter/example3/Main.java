package structuralDesignPatterns.adapter.example3;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        USBImpl usb = new USBImpl();

        computer.connectDevice(usb);

        System.out.println("\n" + "---------------------------" + "\n");

        SDCard sdCard = new SDCardImpl();
        USB sdToUSBAdapter = new SDToUSBAdapter(sdCard);
        computer.connectDevice(sdToUSBAdapter);

    }
}
