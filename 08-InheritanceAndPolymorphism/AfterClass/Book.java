public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private int yearOfPublication;
    private Writer writer;

    public Book(String title, String author, Publisher publisher, Writer writer, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher(){
        return publisher;
    }

    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }

    public Writer getWriter(){
        return writer;
    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public void display(){
        System.out.println("Book title: " + getTitle());
        System.out.println("Book author: " + getAuthor());
        System.out.println("Book publisher: " + getPublisher());
        System.out.println("Year of publishing: " + getYearOfPublication());
        System.out.println("Book writer: " + getWriter());

    }







}
