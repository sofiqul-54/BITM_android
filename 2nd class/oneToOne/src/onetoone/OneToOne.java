
package onetoone;

import java.util.ArrayList;


public class OneToOne {


    public static void main(String[] args) {
        
        newPerson person1 = new newPerson();
        person1.firstName = "Md.";
        person1.middleName = "Eshan";
        person1.lastName = "Bhuiyan";

        newPerson person2 = new newPerson();
        person1.firstName = "Md.";
        person1.middleName = "mahedo";
        person1.lastName = "Alif";
        
        ArrayList<newPerson> personList =new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        
        for (newPerson aPerson : personList) {
            System.out.println(aPerson.getFullName());
        }
        
        
    }
    
}
