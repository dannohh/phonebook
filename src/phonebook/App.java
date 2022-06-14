package phonebook;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		PersonsList directory = new PersonsList();
		System.out.println(
				"Please enter your choice: \n 1: add a contact \n 2: get all contacts \n 3: search by last name \n 4: delete a contact by last name");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				directory.addPerson();
				break;
			case 2:
				directory.getPeople();
				break;
			case 3:
				directory.getPerson();
				break;
			case 4:
				directory.deletePerson();
				break;
			default:
				System.out.println("wrong input choice");
				;
				break;
			}
			System.out.println(
					"Please enter your choice: \n 1: add a contact \n 2: get all contacts \n 3: search by last name \n 4: delete a contact by last name");
			choice = in.nextInt();
		}
	}
}
