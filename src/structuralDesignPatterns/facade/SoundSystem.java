package structuralDesignPatterns.facade;

class SoundSystem {
    public void enable() {
        System.out.println("Səs Sistemi aktivləşdi");
    }

    public void setVolume(int level) {
        System.out.println("Səs səviyyəsi: " + level);
    }

    public void disable() {
        System.out.println("Səs Sistemi söndü");
    }
}