import java.util.ArrayList;

public class Folder {
    
    private String folderName;
    private ArrayList<File> files = new ArrayList<>();

    public Folder(String folderName){
        this.folderName = folderName;
    }

    public String getFolderName(){
        return folderName;
    }

    public void setFolderName(String folderName){
        this.folderName = folderName;
    }

    public String toString(){
        String toString = "";
        if (files.size() == 0){
            return toString + "There is no files in this folder named: " + getFolderName();
        }
        else {
            toString = "The folder named \"" + getFolderName() + "\" contains: \n";
            for (File file : files ) {
                toString += file.getFileName() + "." + file.getType() + "\n";
            }
        }
        return toString;
    }

    public void addFile(File fileName){
        files.add(fileName);
    }

    public void deleteFile(File name){
        files.remove(name);
    }

    public static void main(String[] args){
        Folder folder1 = new Folder("Folder 1");
        File file1 = new File("File 1", 11, "txt");
        File file2 = new File("File 2", 22, "doc");
        File file3 = new File("File 3", 33, "pdf");

        folder1.addFile(file1);
        folder1.addFile(file2);

        System.out.println(folder1.toString());

        folder1.addFile(file3);

        System.out.println(folder1.toString());

        folder1.deleteFile(file1);

        System.out.println(folder1.toString());

    }
}
