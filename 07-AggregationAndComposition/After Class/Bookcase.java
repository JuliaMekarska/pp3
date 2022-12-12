import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void displayBooks(){
        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }

    public static void main(String[] args){
        Bookcase bc1 = new Bookcase();
        Writer w1 = new Writer("NZS", "PSUEK", 100);
        Book b1 = new Book("Planer UEK XD", 220, w1, "planer");

        bc1.addBook(b1);
        bc1.displayBooks();
        
        bc1.removeBook(b1);
        bc1.displayBooks();
    }
}
