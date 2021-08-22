package day24_addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<Contact> addressBook = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
		addContact();
		editContact();
		deleteContact();
	}

	static public void addContact() {
		int flag = 0;
		while (flag == 0) {
			Contact c = new Contact();
			Scanner sc = new Scanner(System.in);
			System.out.println("---New Contact---");
			System.out.println("Enter First Name: ");
			String firstName = sc.next();

			if (!addressBook.isEmpty()) {
				//Using Stream to Check any same Contact exists or not!
				if (addressBook.stream().anyMatch(n -> n.equals(firstName))) {
					System.out.println("Contact Exists!");
					return;
				}
			}
			c.setFirstName(firstName);
			System.out.println("Enter Last Name: ");
			c.setLastName(sc.next());
			System.out.println("Enter Address: ");
			c.setAddress(sc.next());
			System.out.println("Enter City: ");
			c.setCity(sc.next());
			System.out.println("Enter State: ");
			c.setState(sc.next());
			System.out.println("Enter Zip code: ");
			c.setZip(sc.next());
			System.out.println("Enter Phone: ");
			c.setPhone(sc.next());
			addressBook.add(c);
			
			

			System.out.println("Want to Add more? Enter 0 for Yes or 1 for No :");
			flag = sc.nextInt();

		}
	}

	static public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to Edit : ");
		String name = sc.next();
		int flag2 = 0;
		for (int i = 0; i < addressBook.size(); i++) {
			if (addressBook.get(i).getFirstName() == name) {
				flag2 = 1;
				System.out.println("---Edit Contact---");
				System.out.println("Enter First Name: ");
				addressBook.get(i).setFirstName(sc.next());
				System.out.println("Enter Last Name: ");
				addressBook.get(i).setLastName(sc.next());
				System.out.println("Enter Address: ");
				addressBook.get(i).setAddress(sc.next());
				System.out.println("Enter City: ");
				addressBook.get(i).setCity(sc.next());
				System.out.println("Enter State: ");
				addressBook.get(i).setState(sc.next());
				System.out.println("Enter Zip code: ");
				addressBook.get(i).setZip(sc.next());
				System.out.println("Enter Phone: ");
				addressBook.get(i).setPhone(sc.next());
			}
		}
		if (flag2 == 0) {
			System.out.println("No Such Contact Found!");
		}
	}

	static public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to delete : ");
		String name = sc.next();
		int flag2 = 0;
		for (int i = 0; i < addressBook.size(); i++) {
			if (addressBook.get(i).getFirstName() == name) {
				flag2 = 1;
				addressBook.remove(i);
				System.out.println("Deleted!");
			}
		}
		if (flag2 == 0) {
			System.out.println("No Such Contact Found!");
		}
	}
}
