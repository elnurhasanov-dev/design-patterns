package structuralDesignPatterns.adapter.example1;

public class TelefonPrizAdapter implements ElektrikliEvAletleri {
    private Telefon telefon;

    public TelefonPrizAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalisdir() {
        return telefon.sarjEt();
    }
}
