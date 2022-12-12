public class Writer {
    
    private String firstName;
    private String lastName;
    private String genre;

    public Writer(String firstName, String lastName, String genre){
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGenre(){
        return genre;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}

