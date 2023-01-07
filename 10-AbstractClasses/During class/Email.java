public class Email extends Message {
    private String messageSubject;
    private String recipitentAdress;
    private String senderAdress;

    public String getSenderAdress() {
        return senderAdress;
    }

    public void setSenderAdress(String senderAdress) {
        this.senderAdress = senderAdress;
    }

    public String getMessageSubject() {
        return messageSubject;
    }
    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }
    public String getRecipitentAdress() {
        return recipitentAdress;
    }
    public void setRecipitentAdress(String recipitentAdress) {
        this.recipitentAdress = recipitentAdress;
    }

    Email(String senderAdress){
        super();
        this.senderAdress = senderAdress;
    }

    Email(String text, String messageSubject, String reipitentAdress){
        super(text);
        this.messageSubject=messageSubject;
        this.recipitentAdress=reipitentAdress;
    }

    @Override
    public void send(){
        System.out.println("Email: " + getText());
    }
    
}
