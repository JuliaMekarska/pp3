public class Chapter {
    private String title;
    private int numOfPages;
    private int startPageNum;

    public Chapter(String title, int numOfPages, int startPageNum){
        this.title = title;
        this.numOfPages = numOfPages;
        this.startPageNum = startPageNum;
    }

    public String getTitle(){
        return title;
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public int getStartPageNum(){
        return startPageNum;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public void setStartPageNum(int startPageNum){
        this.startPageNum = startPageNum;
    }

}
