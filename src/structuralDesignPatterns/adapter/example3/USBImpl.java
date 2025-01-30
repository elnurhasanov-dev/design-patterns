package structuralDesignPatterns.adapter.example3;

public class USBImpl implements USB {

    @Override
    public void connectWithUSB() {
        System.out.println("USB connected");
    }
}
