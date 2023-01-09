public class Logic {
    public boolean[] arr;

    public Logic(boolean[] arr){
        this.arr = arr;
    }

    public int opposite(){
        int counter=0;

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] == arr[i+1]){
                counter+=1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Logic l1 = new Logic(new boolean[] {true, false, false});
        Logic l2 = new Logic(new boolean[] {true, false, true,false});
        Logic l3 = new Logic(new boolean[] {true, false, true,true,false,true,false,true,false});
        System.out.println(l1.opposite());
        System.out.println(l2.opposite());
        System.out.println(l3.opposite());
    }
}
