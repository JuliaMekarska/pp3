import java.util.ArrayList;

class Library{

    private ArrayList<Book> shelf = new ArrayList<Book>();


    public void display(){
        System.out.println("List of books: " );
        for (Book book : shelf){
            book.display();
        }
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    public void removeBook(Book book){
        shelf.remove(book);
    }

    public static void main(String[] args){

        Publisher p1 = new Publisher("Wydawnictwo Literackie", "Kraków");
        Writer w1 = new Writer("Jakis", "Gosc", "gatunek");
        Book b1 = new Book("Inferno", "Don Brown", p1, w1, 1999);
        Ebook eb1 = new Ebook("Harry Potter", "J.K.Rowling", p1, w1, 1999, "HarryPotter.txt");
        Ebook eb2 = new Ebook("Gra o Tron", "George R. R. Martin", p1, w1, 1999, "GraOTron.txt");
        Audiobook ab1 = new Audiobook("Wyznania Gejszy", "Arthur Golden", p1, w1, 1999, 123, 123);
        Audiobook ab2 = new Audiobook("Zły Las", "A. Papiluk", p1, w1, 1999, 321, 321);

        b1.display();
        eb1.display();
        eb2.display();
        ab1.display();
        ab2.display();

        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(ab1);
        l1.addBook(ab2);
        l1.addBook(eb1);
        l1.addBook(eb2);

        l1.display();

    }

}

