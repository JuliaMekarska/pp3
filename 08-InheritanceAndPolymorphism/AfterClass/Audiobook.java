public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, Publisher publisher, Writer writer, int yearOfPublication, int minutes, int seconds) {
        super(title, author, publisher, writer, yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){
        System.out.println("Audiobook minutes: " + getMinutes());
        System.out.println("Audiobook seconds: " + getSeconds());
    }
    
}
