package structuralDesignPatterns.proxy.example2;

public class Main {
    public static void main(String[] args) {
        var realDatabase = new RealDatabase();
        // Admin istifadəçi
        Database adminProxy = new DatabaseProxy("admin");
        adminProxy.connect();

        // Adi istifadəçi
        Database userProxy = new DatabaseProxy("user");
        userProxy.connect();
    }
}
