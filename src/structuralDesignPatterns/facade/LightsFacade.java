package structuralDesignPatterns.facade;

// 4. Additional Facade (Əlavə Facade)
class LightsFacade {
    private Lights lights;

    public LightsFacade() {
        this.lights = new Lights();
    }

    public void setReadingMode() {
        lights.brighten();
    }

    public void setMovieMode() {
        lights.dim(70);
    }
}