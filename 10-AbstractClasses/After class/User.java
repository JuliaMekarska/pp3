public class User {
    protected String firstName;
    protected String lastName;
    protected SMS phoneNumber;
    protected Email emailUser;

    User(String firstName, String lastName, SMS smsUser, Email emailUser){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = smsUser;
        this.emailUser = emailUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SMS getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(SMS phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Email getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(Email emailUser) {
        this.emailUser = emailUser;
    }

}
