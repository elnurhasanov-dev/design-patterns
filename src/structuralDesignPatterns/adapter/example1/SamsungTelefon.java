package structuralDesignPatterns.adapter.example1;

public class SamsungTelefon implements Telefon{
    private int calismaVoltaji;

    public SamsungTelefon() {
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon calisiyor.");
        return calismaVoltaji;
    }
}
