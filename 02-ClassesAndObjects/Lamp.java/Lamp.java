public class Lamp {
    boolean isOn;
    
    public void switchOn() {
        if (isOn) {
            System.out.println("The lamp is already on");
        } else {
            isOn = !isOn;
        }
    }
    
    public void switchOff() {
        if (!isOn) {
            System.out.println("The lamp is already off");
        } else {
            isOn = !isOn;
        }
    }
    
    public void checkLamp() {
        if (isOn) {
           System.out.println("The lamp is on");
        } else {
           System.out.println("The lamp is off");
        }
    }
    
     public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.switchOn();
        lamp.switchOn();
        lamp.switchOff();
        lamp.switchOff();
        lamp.checkLamp();
        lamp.switchOn();
        lamp.checkLamp();
    }
}