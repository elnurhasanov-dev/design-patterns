package structuralDesignPatterns.proxy;

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
