import java.util.ArrayList;

public class Book {
    private String title;
    private int numOfPages;
    private Writer writer;
    private String genre;
    private ArrayList<Chapter> chapters = new ArrayList<>();

    public Book(String title, int numOfPages, Writer writer, String genre) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.writer = writer;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public Writer getWriter(){
        return writer;
    }

    public String getGenre(){
        return genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void displayData(){
        System.out.println(getTitle() + ", " + getNumOfPages() + ", " + writer.getName() + " " + writer.getSurname() + ", " + getGenre());
    }

    public void newChapter(String title,int numOfPages, int startPageNum){
        chapters.add(new Chapter(title, numOfPages, startPageNum));
    }

    public void displayChapters(){
        System.out.println("List of chapters: ");
        for (Chapter chapter : chapters){
            System.out.println(chapter.getTitle());
        }
    }

    public static void main(String[] args){
        Writer w1 = new Writer("Dan", "Brown", 58);
        Book b1 = new Book("Inferno", 555, w1, "Thriller");

        b1.displayData();
        b1.newChapter("Rozdzial trzeci", 50, 123);
        b1.newChapter("Rozdzial czwarty", 70, 432);
        b1.displayChapters();
    }

    

}
