public class Bus extends Vehicle{
    
    private String color;

    public Bus(String brand, String model, int wheels, int doors, boolean isOn, String color){
        super(brand, model, wheels, doors, isOn);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void start() {
        System.out.println("The bus started driving");
    }

    @Override
    void stop() {
        System.out.println("The bus stopped driving");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("The bus is: " + getColor());

    }
}
