package structuralDesignPatterns.facade;

class Projector {
    public void powerOn() {
        System.out.println("Proyektor aktivləşdi");
    }

    public void setInput(String input) {
        System.out.println("Proyektorun girişi: " + input);
    }

    public void powerOff() {
        System.out.println("Proyektor söndü");
    }
}