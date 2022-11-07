public class InternetDevice {
    
    String deviceName;
    boolean isConnected = false;
    static int connectedDevices = 0;
    
    public InternetDevice(String name) {
        this.deviceName = name;
    }

    public void Connect() {
        if (!isConnected) {
        this.isConnected = true;
        connectedDevices += 1;
        }
    }

    public void Disconnect() {
        if (isConnected) {
        this.isConnected = false;
        connectedDevices -= 1;
        }
    }

    public void isConnected() {
        System.out.println("Status: " + this.isConnected);
    }

    public void DisplayStatus() {
        System.out.println("Name: " + this.deviceName);
        System.out.println("Is connected to the Internet? " + this.isConnected);
    }

    public static void DisplayConnections() {
        System.out.println("Connected devices: " + connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("Tv");
        InternetDevice device2 = new InternetDevice("Ipad");
        InternetDevice device3 = new InternetDevice("Laptop");
        InternetDevice device4 = new InternetDevice("Phone");
        InternetDevice device5 = new InternetDevice("Computer");

        device1.Connect();
        device2.Connect();
        device3.Connect();

        device1.DisplayStatus();
        device2.DisplayStatus();
        device3.DisplayStatus();
        device4.DisplayStatus();
        device5.DisplayStatus();

        InternetDevice.DisplayConnections();
    }
}