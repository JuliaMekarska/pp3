public class MainTV {
    
    public static void main(String[] args){
        TV t = new TV();

        t.displayChannels();
        t.on();
        t.displayData();
        t.setChannel(15);
        t.setVolume(7);
        t.displayData();
        t.setChannel(10);
        t.setVolume(5);
        t.displayData();
        t.off();
        t.displayData();

    }
}
