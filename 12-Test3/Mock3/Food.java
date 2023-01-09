public abstract class Food {
    
    private String name;
    private double price;

    public Food(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(){};
}
