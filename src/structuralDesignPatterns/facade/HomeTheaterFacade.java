package structuralDesignPatterns.facade;

// 2. Facade (Və ünvan)
class HomeTheaterFacade {
    private DvdPlayer dvd;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;

    public HomeTheaterFacade() {
        this.dvd = new DvdPlayer();
        this.projector = new Projector();
        this.sound = new SoundSystem();
        this.lights = new Lights();
    }

    // 3. Client üçün sadələşdirilmiş metodlar
    public void watchMovie(String movieTitle) {
        System.out.println(">>> Filmə başlamaq üçün hazırlıq...");
        projector.powerOn();
        projector.setInput("DVD");
        lights.dim(70);
        sound.enable();
        sound.setVolume(25);
        dvd.turnOn();
        dvd.play(movieTitle);
    }

    public void endMovie() {
        System.out.println(">>> Sistem söndürülür...");
        dvd.turnOff();
        sound.disable();
        projector.powerOff();
        lights.brighten();
    }
}