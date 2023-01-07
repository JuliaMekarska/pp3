public abstract class Message {
    private String text;

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    Message(){
        this.text = "";
    }

    Message(String text){
        this.text = text;
    }

    public int charNumber(){
        char[] chars = this.text.toCharArray();

        return chars.length;
    }

    public abstract void send();
}