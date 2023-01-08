public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {

    private int channelNo;
    private int volume;
    private boolean isOn;

    public void setVolume(int volume) {
        if (volume >= 1 && volume <= 10){
            this.volume = volume;
        }
        else {
            System.out.println("There is not such a volume level, try again");
        }
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
        if (getIsOn() == true){
            System.out.println("Channel: " + channelNo + "\n" + "Volume: " + volume + "\n" + "Is on?: " + isOn);
        }
        else {
            System.out.println("Volume: " + volume + "\n" + "Is on?: " + isOn);

        }
    }

}
