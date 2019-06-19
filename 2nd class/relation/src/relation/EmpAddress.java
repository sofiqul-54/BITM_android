/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author Mobile App Develop
 */
public class EmpAddress {
    private String city;
    private String zip;
    private String house_no;
    private String Road_no;

    public EmpAddress(String city, String zip, String house_no, String Road_no) {
        this.city = city;
        this.zip = zip;
        this.house_no = house_no;
        this.Road_no = Road_no;
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

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getRoad_no() {
        return Road_no;
    }

    public void setRoad_no(String Road_no) {
        this.Road_no = Road_no;
    }

    @Override
    public String toString() {
        return "EmpAddress{" + "city=" + city + ", zip=" + zip + ", house_no=" + house_no + ", Road_no=" + Road_no + '}';
    }
    
    
}
