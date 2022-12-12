public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, Publisher publisher, Writer writer, int yearOfPublication, String fileName) {
        super(title, author, publisher, writer, yearOfPublication);
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
    public void display(){
        super.display();
        System.out.println("File name: " + getFileName());
    }
}