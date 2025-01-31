package structuralDesignPatterns.proxy.example2;

public class DatabaseProxy implements Database {

    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void connect() {
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }

        // Access Control
        if ("admin".equals(userRole)) {
            realDatabase.connect();
        } else {
            System.out.println("Access denied! Only Admin can");
        }
    }
}
