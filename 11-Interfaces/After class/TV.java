import java.util.Arrays;

public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {

    private int channelNo;
    private int volume;
    private boolean isOn;
    private String[] channels = new String[99];


    public void setVolume(int volume) {
        if (volume >= 1 && volume <= 10){
            this.volume = volume;
        }
        else {
            System.out.println("There is not such a volume level, try again");
        }
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String[] getChannels() {
        return channels;
    }

    public String getChannelName(int n){
        return channels[n];
    }

    @Override
    public void on(){
        isOn = true;
        this.channelNo = 1;
        this.volume = 1;
    }

    @Override
    public void off(){
        isOn = false;
    }

    @Override
    public void channelUp(){

        if (getIsOn() == false){
            System.out.println("Tv is off, turn it on first");
        }

        else {
            if (getChannelNo() >= 1 && getChannelNo() < 99){
                this.channelNo += 1;
            }

            else {
                System.out.println("You reached the last channel and you can not go up");
            }
        }
    }

    @Override
    public void channelDown(){
        if (getIsOn() == false){
            System.out.println("Tv is off, turn it on first");
        }

        else {
            if (getChannelNo() > 1 && getChannelNo() <= 99){
                this.channelNo -= 1;
            }

            else {
                System.out.println("You are on the first channel and you can not go down");
            }
        }
    }

    @Override
    public void setChannel(int channelNo){
        if (channelNo >= 1 && channelNo <= 99){
            this.channelNo = channelNo;
        }
        else {
            System.out.println("There is not such a channel, try again");
        }
    }

    @Override
    public void volumeUp(){
        if(getIsOn() == false){
            System.out.println("Tv is off, turn it on first");
        }

        else {
            if (getVolume() >= 1 && getVolume() < 10) {
                this.volume += 1;
            }
            else{
                System.out.println("You reached maximum volume and you can not increase it");
            }
        }
    }

    @Override
    public void volumeDown(){
        if(getIsOn() == false){
            System.out.println("Tv is off, turn it on first");
        }

        else {
            if (getVolume() > 1 && getVolume() <= 10) {
                this.volume -= 1;
            }
            else{
                System.out.println("You reached minimum volume and you can not decrease it");
            }
        }
    }

    public void displayData(){ 

        channels[0] = "ch1";
        channels[1] = "ch2";
        channels[2] = "ch3";
        channels[3] = "ch4";
        channels[4] = "ch5";
        channels[5] = "ch6";
        channels[6] = "ch7";
        channels[7] = "ch8";
        channels[8] = "ch9";
        channels[9] = "ch10";

        if (channelNo > 10){
    
            if (getIsOn() == true){
                System.out.println("Channel: " + channelNo + "\n" + "Volume: " + volume + "\n" + "Is on?: " + isOn + "\n");
            }
            else {
                System.out.println("Volume: " + volume + "\n" + "Is on?: " + isOn + "\n");
            }
        }
        
        else {
            if (getIsOn() == true){
                System.out.println("Channel: " + channelNo + "\n" + "Channels name: " + getChannelName(getChannelNo() - 1) + "\n" + "Volume: " + volume + "\n" + "Is on?: " + isOn + "\n");
            }
            else {
                System.out.println("Volume: " + volume + "\n" + "Is on?: " + isOn + "\n");
            }
        }

    }

    public void displayChannels(){

        channels[0] = "ch1";
        channels[1] = "ch2";
        channels[2] = "ch3";
        channels[3] = "ch4";
        channels[4] = "ch5";
        channels[5] = "ch6";
        channels[6] = "ch7";
        channels[7] = "ch8";
        channels[8] = "ch9";
        channels[9] = "ch10";

        for (String channel : getChannels()){
            if (channel != null){
                System.out.println("Channels name: " + channel + ", " + "Channels number: " + (Arrays.asList(channels).indexOf(channel) + 1) + "\n" );
            }
        }
    }

}
