package structuralDesignPatterns.adapter;

public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri) {

        int volt = elektrikliEvAletleri.prizeTakVeCalisdir();
        System.out.println("Prizden " + volt + " volt aliniyor");

    }
}
