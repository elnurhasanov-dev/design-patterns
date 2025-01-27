package structuralDesignPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Priz priz = new Priz();
        Utu utu = new Utu();

        priz.elektrikVer(utu);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonPrizAdapter adapter = new TelefonPrizAdapter(samsungTelefon);

        priz.elektrikVer(adapter);
    }
}
