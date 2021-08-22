package day24_addressbook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
	}
	static public void addContact() {
		int flag=0;
		while(flag ==0) {
			Contact c = new Contact();
			Scanner sc = new Scanner(System.in); 
			System.out.println("---New Contact---");
			System.out.println("Enter First Name: ");
			String firstName = sc.next();
			c.setFirstName(firstName);
			System.out.println("Enter Last Name: ");
			c.setLastName(sc.next());
			System.out.println("Enter Address: ");
			c.setAddress(sc.next());
			System.out.println("Enter City: ");
			String cityName=sc.next();
			c.setCity(cityName);
			System.out.println("Enter State: ");
			String stateName=sc.next();
			c.setState(stateName);
			System.out.println("Enter Zip code: ");
			c.setZip(sc.next());
			System.out.println("Enter Phone: ");
			c.setPhone(sc.next());
			
			System.out.println("Want to Add more? Enter 1 for Yes or 2 for No :");
			// if flag is 0 then only loop will run again.
			flag = sc.nextInt();
			
		}
	}
}
