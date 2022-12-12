public class File {
    
    private String fileName;
    private double fileSize;
    private String type;

    public File(String fileName, double fileSize, String type){
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.type = type;
    }

    public String getFileName(){
        return fileName;
    }

    public double getFileSize(){
        return fileSize;
    }

    public String getType(){
        return type;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }

    public void setType(String type){
        this.type = type;
    }
}
