package structuralDesignPatterns.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    public static final Map<String, Book> bookMap = new HashMap<>();

    public static Book getBook(String author, String genre) {
        String key = author + "-" + genre;

        if (!bookMap.containsKey(key)) {
            System.out.println("Yeni kitab yaradırıq: " + key);
            bookMap.put(key, new PaperBook(author, genre));
        }

        return bookMap.get(key);
    }
}
