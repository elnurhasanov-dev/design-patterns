package structuralDesignPatterns.adapter.example3;

public class Computer {

    public void connectDevice(USB usbDevice) {
        System.out.println("Computer connecting to USB device...");
        usbDevice.connectWithUSB();
    }
}
