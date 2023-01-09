public class Pizza extends Food implements Extra{

    private int size;

    public Pizza(String name, int size){
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setPrice(){
        setPrice(getSize() - 1);
    }

    @Override
    public double discount(){
        if (getPrice() >= 30){
            
            return (getPrice() * 0.95);

        }
        else {
            return getPrice();
        }
    }

    @Override
    public double delivery(){
        if (getSize() >= 50){
            return 8;
        }
        else {
            return 6;
        }
    }

    @Override
    public double delivery(int tip){
        if (getSize() >= 50){
            return (8 + tip);
        }
        else {
            return (6 + tip);
        }
    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margherita",60);
        Pizza p2 = new Pizza("Pepperoni",25);

        System.out.println("Pizza nr 1:");
        p1.setPrice();
        System.out.println(p1.delivery());
        System.out.println(p1.discount());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getSize());
        System.out.println("\n");
        System.out.println("Pizza nr 2:");
        p2.setPrice();
        System.out.println(p2.delivery());
        System.out.println(p2.discount());
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getSize());
    }
    
}
