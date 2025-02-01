package structuralDesignPatterns.facade;

// 5. Client (İstifadəçi)
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        // Facade vasitəsilə kompleks əməliyyatlar
        theater.watchMovie("Inception");
        System.out.println("\n... Film davam edir ...\n");
        theater.endMovie();

        // Additional Facade istifadəsi
        LightsFacade lights = new LightsFacade();
        lights.setMovieMode();
    }
}