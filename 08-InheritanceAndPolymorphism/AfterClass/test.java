import java.util.ArrayList;

public class test {
        
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Publisher p1 = new Publisher("Wydawnictwo Literackie", "Kraków"); 
        Writer w1 = new Writer("Jakis", "Gosc", "gatunek");
        Book b1 = new Book("Dzieci z Bulerbyn", "Astrid Lindgren", p1, w1, 1999);
        Book b2 = new Ebook("Smentarz zwieżąt", "Stephen King", p1, w1, 1999, "SmentarzZwiezat.txt");
        Book b3 = new Audiobook("Bazar złych snów", "Stephen King", p1, w1, 1999, 94, 13);
    }
}
