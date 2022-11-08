public class DrivingLicense {

    private String surname; 
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNum;
    private int yearOfIssue;
    private String licenseCategory;

    void displayInfo() {

        "Name: " + name);
        "Surname: " + surname);
        "Street: " + address);
        "Postal code: " + postalCode);
        "City: " + city);
        "Driving License Number: " + drivingLicenseNum);
        "Year of issue: " + yearOfIssue);
        "License category: " + licenseCategory);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.substring(beginIndex: 0, endIndex: 1).toUpperCase() + name
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

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String city) {
        this.licenseCategory = licenseCategory;
    }

    public toString() {
        return "Name: " + name, "Surname: " + surname, "Street: " + address, "Postal Codde: " + postalCode, "City: " + city, "Driving license number: " + drivingLicenseNum,
        "Year of issue: " + yearOfIssue, "License category: " + licenseCategory;

    }

}
