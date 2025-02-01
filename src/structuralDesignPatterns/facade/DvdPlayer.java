package structuralDesignPatterns.facade;

// 1. Complex Subsystem Classes (Subsistem sinifləri)
class DvdPlayer {
    public void turnOn() {
        System.out.println("DVD Player aktivləşdi");
    }

    public void play(String movie) {
        System.out.println("Film başladı: " + movie);
    }

    public void turnOff() {
        System.out.println("DVD Player söndü");
    }
}