package structuralDesignPatterns.adapter.example2;

public class Main {

    public static void main(String[] args) {
        Crypt crypt = new CryptA();
        crypt.encrypt("John");
        crypt.decrypt("Doe");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Ahmet");
        crypt.decrypt("Acar");
    }
}
