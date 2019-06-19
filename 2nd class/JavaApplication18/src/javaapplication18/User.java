
package javaapplication18;


public class User {
    
    private String id;
    private String name;
    private String email;
    private String gender;
    private String dept;
    private String phnoneNumber;
    private String address;
    
    
    User(){
    }
    
    User(String id){
      this.id = id;  
    }
    User(String id,String name){
        this(id);
        this.name=name;
    }
    User(String id,String name,String email){
        
        this(id,name);
        this.email=email;
    }
     User(String id,String name,String email,String gender){
        
        this(id,name,email);
        this.gender = gender;
    }
      User(String id,String name,String email,String gender,String dept){
        
        this(id,name,email,gender);
        this.dept= dept;
    }
       User(String id,String name,String email,String gender,String dept,String phoneNumber){
        
        this(id,name,email,gender,dept);
        this.phnoneNumber= phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhnoneNumber() {
        return phnoneNumber;
    }

    public void setPhnoneNumber(String phnoneNumber) {
        this.phnoneNumber = phnoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    void Display(){
      if(getAddress()!=null){
        System.out.println("Address:"+address);  
      }
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Gender:"+gender);
        System.out.println("Dept:"+dept);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
    }
    
 
    
}
