public class SuperCounter extends Counter{
    
    public Counter[] counter;

    public SuperCounter(int counter){
        super(counter);
    }

    public void addN(int n){
        int i = 0;
        while (i < n) {
            add1();
            i++;
        }
    }

    public static void main(String[] args) {
        SuperCounter c1 = new SuperCounter(100);
        c1.addN(100);
        System.out.println(c1.getCounter());
    }

}
