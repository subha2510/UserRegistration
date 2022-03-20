package com.userregistration;
import java.util.Scanner;

public class Mobile {
	public static void main(String[] args) {
	  Scanner scanner  = new Scanner(System.in);
      RegexRegistration regex = new RegexRegistration();
   
 
	  System.out.println("Enter your FirstName:");
	 
	  String firstName = scanner.next(); 
	  regex.userFirstName(firstName);
	  
	  System.out.println("Enter your LastName:");

	  String lastName = scanner.next(); 
	  regex.userLastName(lastName);

      System.out.println("Enter your email id:");
      
      String email = scanner.next();
      regex.userEmail(email);
	  
      System.out.println("Enter your MobileNum:");
      
      String password = scanner.next();
      regex.userMobileNum(MobileNum);
	  
      
	}
	
}