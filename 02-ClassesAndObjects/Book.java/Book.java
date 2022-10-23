public class Book {
    String title;
    String author;
    String genre;
    int pagesNumber;
    int currentPage = 0;
    
    public void displayData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Number of pages: " + pagesNumber);
        System.out.println("Current page: " + currentPage);
    }
    
    public void readBook() {
        currentPage ++;
    }
    
     public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Master and Margarita";
        book1.author = "Mikhail Bulgakov";
        book1.genre = "Fantasy";
        book1.pagesNumber = 448;
        
        Book book2 = new Book();
        book2.title = "Game of Thrones: A Song of Ice and Fire";
        book2.author = "Martin George R.R.";
        book2.genre = "	Epic fantasy";
        book2.pagesNumber = 886;
        
        book1.displayData();
        book1.readBook();
        book1.displayData();
        
        book2.displayData();
        book2.readBook();
        book2.readBook();
        book2.readBook();
        book2.displayData();
    }
}