public class Phone {
    private String brand;
    private String model;
    private boolean isOn;
    private int batery;
    private double screenSize;

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

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void turnOnOff() {
        isOn = !isOn;
    }

    public void displayData() {
        System.out.println("Brand: " + brand + "\n"
        + "Model: " + model + "\n"
        + "Is on?: " + isOn + "\n"
        + "Batery %: " + batery + "\n"
        + "Screen size: " + screenSize + "\n");
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("Samsung");
        p1.setModel("Galaxy s10");
        p1.setIsOn(false);
        p1.setBatery(68);
        p1.setScreenSize(12);

        p1.getBrand();
        p1.getModel();
        p1.getIsOn();
        p1.getBatery();
        p1.getScreenSize();

        p1.displayData();
        p1.turnOnOff();
        p1.displayData();
    }
}