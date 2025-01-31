package structuralDesignPatterns.proxy.example1;

public class Main {
    public static void main(String[] args) {

        var proxyImage = new ProxyImage("dog.jpg");
        proxyImage.display();
        proxyImage.display();

        // Output
        // Loading image: dog.jpg
        // Displaying image: dog.jpg
        // Displaying image: dog.jpg
    }
}
