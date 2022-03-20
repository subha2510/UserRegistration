package com.userregistration;
import java.util.Scanner;

public class FirstName {
	public static void main(String[] args) {
	  Scanner scanner  = new Scanner(System.in);
      RegexRegistration regex = new RegexRegistration();
   	  System.out.println("Enter your FirstName:");
	  String firstName = scanner.next(); 
	  regex.userFirstName(firstName);
	}
	
}