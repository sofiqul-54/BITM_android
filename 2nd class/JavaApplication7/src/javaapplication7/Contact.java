
package javaapplication7;


public class Contact {
    private String city;
    private String zip;
    private String phone;
    private String emailaddress;

    public Contact(String city, String zip, String phone, String emailaddress) {
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.emailaddress = emailaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @Override
    public String toString() {
        return "Contact{" + "city=" + city + ", zip=" + zip + ", phone=" + phone + ", emailaddress=" + emailaddress + '}';
    }
    
    
 
    
    
}
