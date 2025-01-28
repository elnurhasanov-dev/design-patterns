package structuralDesignPatterns.flyweight;

public class Main {
    public static void main(String[] args) {
        Book book1 = BookFactory.getBook("Gabriel Garcia Marquez", "Roman");
        book1.showBookDetails("Yüz İllik Tənha Qalma");

        Book book2 = BookFactory.getBook("George Orwell", "Dram");
        book2.showBookDetails("1984");

        Book book3 = BookFactory.getBook("Gabriel Garcia Marquez", "Roman");
        book3.showBookDetails("Sevgidə və Digər Şeylərdə Kolera");

        Book book4 = BookFactory.getBook("George Orwell", "Dram");
        book4.showBookDetails("Heyvan Ferması");

        // Yaddaşı yoxlamaq üçün
        System.out.println("Yaradılan obyektlərin sayı: " + BookFactory.bookMap.size());
    }
}
