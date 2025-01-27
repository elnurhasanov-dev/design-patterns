package creationalDesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Data admin = new Data("Elnur", "Hasanov");
        Data admin2 = new Data("Teymur", "Hasanov");

        Singleton singleton = Singleton.getInstance(admin);
        Singleton singleton2 = Singleton.getInstance(admin2);

        String adminName = singleton.getData().name;
        String adminName2 = singleton2.getData().name;

        System.out.println(adminName + " " + adminName2);

        DbConnection db = DbConnection.getConnection();
        db.addQuery("First query");
        db.addQuery("Second query");
        db.showQueries();
    }
}