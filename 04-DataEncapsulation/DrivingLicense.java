public class DrivingLicense {

    private String surname; 
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNum;
    private int yearOfIssue;
    private String category;

    void displayInfo() {

        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAddress());
        System.out.println(getPostalCode());
        System.out.println(getCity());
        System.out.println(getDrivingLicenseNum());
        System.out.println(getYearOfIssue());
        System.out.println(getCategory());

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDrivingLicenseNum() {
        return drivingLicenseNum;
    }

    public void setDrivingLicenseNum(String drivingLicenseNum) {
        this.drivingLicenseNum = drivingLicenseNum;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "Name: " + getName() + "Surname: " + getSurname() + "\n" + "Street: " + getAddress() + "Postal Codde: " + getPostalCode() + "City: " + getCity() + "\n" + "Driving license number: " + 
        getDrivingLicenseNum() + "Year of issue: " + getYearOfIssue() + "License category: " + getCategory();

    }

}
