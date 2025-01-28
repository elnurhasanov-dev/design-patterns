package structuralDesignPatterns.adapter.example2;

public class CryptA implements Crypt {

    @Override
    public void encrypt(String text) {

        System.out.println("#CryptA#encrypt()");
    }

    @Override
    public void decrypt(String text) {

        System.out.println("#CryptA#decrypt()");
    }
}
