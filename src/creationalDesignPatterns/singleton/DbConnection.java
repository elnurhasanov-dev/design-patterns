package creationalDesignPatterns.singleton;

public class DbConnection {
    private static DbConnection dbConnection;
    private static String queyHistory = "Query history + \n";

    public static DbConnection getConnection() {
        if (dbConnection == null) return new DbConnection();
        return dbConnection;
    }

    public void addQuery(String query) {
        queyHistory += query + "\n";
    }

    private DbConnection() {
    }

    public void showQueries() {
        System.out.println(queyHistory);
    }
}
