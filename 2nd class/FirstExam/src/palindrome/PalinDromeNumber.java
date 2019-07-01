/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Mobile App Develop
 */
public class PalinDromeNumber {

    public static void main(String[] args) {
        int number;
		String num ;
		Scanner scanner = new Scanner(System.in);
		
		
		
		//System.out.println(num.length());
		
		while(true) {
			System.out.println("Please enter a number: ");
			number = scanner.nextInt();
			
			num = Integer.toString(number);
			if (num.length() == 5) {
				break;
			}
			else if(num.length()< 5) {
				System.out.println("less than 5 number");
			}else{
				System.out.println("greater than 5 number");
			}
			
		} 
		
		
		String reverString = "";
		for (int i = num.length()- 1; i >=0; i--) {
			reverString = reverString + num.charAt(i);
		}
		
		if(num.equals(reverString)) {
			System.out.println("It is a palindrome number.");
		}else {
			System.out.println("It is not a palindrome number.");
			
		}
		System.out.println(reverString);
		
    }
}
