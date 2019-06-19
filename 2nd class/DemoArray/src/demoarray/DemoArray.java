/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mobile App Develop
 */
public class DemoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<User> list = new ArrayList();
        User user1 = new User("shiuly", "123", "a@gmail.com");
        list.add(user1);

        User user2 = new User("abc", "123", "a@gmail.com"); 
        
        
        list.add(user2);

        list.add(new User("tohidul", "789", "go@gmail.com"));

        for (User x : list) {
            System.out.println(x.getName());
        }
    }

}
