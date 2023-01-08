public class MainTV {
    
    public static void main(String[] args){
        TV t = new TV();

        t.on();
        t.displayData();
        //t.channelUp();
        //t.displayData();
        //t.setChannel(7);
        t.setChannel(15);
        t.setVolume(7);
        t.displayData();
        //t.setChannel(142);
        //t.displayData();
        //t.channelDown();
        //t.displayData();
        t.off();
        t.displayData();

    }
}
