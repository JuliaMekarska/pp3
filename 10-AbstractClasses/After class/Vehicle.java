public abstract class Vehicle {
    private String brand;
    private String model;
    private int wheels;
    private int doors;
    private boolean isOn;

    Vehicle(String brand, String model,int wheels,int doors, boolean isOn){
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
        this.isOn = isOn;
    }

    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public boolean getIsOn() {
        return isOn;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    abstract void start();
    abstract void stop();

    public void displayInfo(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println("Number of wheels: " + getWheels());
        System.out.println("Number of doors: " + getDoors());
        System.out.println("Is on? " + getIsOn());
    }

    public static void main(String[] args){
        Car c = new Car("Toyota", "Corrolla", 4, 5, false, "red");
        Truck t = new Truck("Volvo", "FH16", 8, 2, true, "gray");
        Bus b = new Bus("Autosan", "H9", 4, 2, true, "yellow");

        c.setIsOn(true);
        t.setIsOn(false);
        b.setIsOn(true);

        c.displayInfo();
        t.displayInfo();
        b.displayInfo();

    }
}
