package structuralDesignPatterns.adapter.example1;

public class Utu implements ElektrikliEvAletleri {
    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalisdir() {
        System.out.println("Utu calisiyor");
        return volt;
    }
}
