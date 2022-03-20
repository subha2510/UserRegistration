package com.userregistration;
import java.util.Scanner;

public class LastName {
	public static void main(String[] args) {
	  Scanner scanner  = new Scanner(System.in);
      RegexRegistration regex = new RegexRegistration();
	  System.out.println("Enter your FirstName:");
	  String firstName = scanner.next(); 
	  regex.userFirstName(firstName);
	  System.out.println("Enter your LastName:");
	  String lastName = scanner.next(); 
	  regex.userFirstName(lastName);
	}
}