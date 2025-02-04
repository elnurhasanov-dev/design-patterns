package structuralDesignPatterns.flyweight.example1;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public  List<Book> books = new ArrayList<>();

    public void storeBooks(String name, double price, String type, String distributor, String otherData) {
        var bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }
}
