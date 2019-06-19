/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;
public class Array {

    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter The 5  Array values");
        for (int i = 0; i < array.length; i++) {
            
         array[i]=in.nextInt();   
        }
        
        System.out.println("The Array Value is: ");
        for(int p : array){
            
              System.out.print(p+ " ");
        }
    }
    
}
