package structuralDesignPatterns.flyweight;

public class PaperBook implements Book {

    private final String author;
    private final String genre;

    public PaperBook(String author, String genre) {
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void showBookDetails(String title) {
        System.out.println("Book: " + title + " | Author: " + author + " | Genres: " + genre);
    }
}
