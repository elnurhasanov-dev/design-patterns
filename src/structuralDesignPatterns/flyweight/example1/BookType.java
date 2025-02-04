package structuralDesignPatterns.flyweight.example1;

public class BookType {
    private final String type;
    private final String distribitor;
    private final String otherData;

    public BookType(String type, String distribitor, String otherData) {
        this.type = type;
        this.distribitor = distribitor;
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "type='" + type + '\'' +
                ", distribitor='" + distribitor + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
