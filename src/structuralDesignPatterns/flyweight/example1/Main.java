package structuralDesignPatterns.flyweight.example1;

public class Main {
    public static void main(String[] args) {
        var store = new Store();
        store.storeBooks(
                "bookName",
                15, "bookType",
                "bookDistributor",
                "bookOtherData");

        store.storeBooks(
                "bookName",
                15, "bookType",
                "bookDistributor",
                "bookOtherData");

        System.out.println(store.books);
    }
}
