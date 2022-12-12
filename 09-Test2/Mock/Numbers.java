import java.util.Arrays;

public class Numbers{
    public int n1;
    public int n2;
    public int n3;
    public int n4;
    public int n5;

    public Numbers(int n1, int n2, int n3, int n4, int n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }
    
    public boolean different(){
        int[] arrayInt={n1,n2,n3,n4,n5};
        Arrays.sort(arrayInt);

        for(int i = 0; i<arrayInt.length-1; i++) {

            if (arrayInt[i] == arrayInt[i+1]) {
                return false;
            }
        }
        
    return true;
    }


    public static void main(String[] args) {
        Numbers n1 = new Numbers(3,4,1,2,6);
        Numbers n2 = new Numbers(9,7,4,3,7);
        System.out.println(n1.different());
        System.out.println(n2.different());
    }
}