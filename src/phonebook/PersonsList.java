package phonebook;

import java.util.*;

public class PersonsList {
	static Person[] myListOfPeople = { new Person("Rand", "al Thor", "5555555", "1 HillTop Emonds Field"),
			new Person("Jack", "Skellington", "5555555", "123 Elm Halloween Town"),
			new Person("Francis", "Bacon", "5555555", "123 York House London"),
			new Person("Asclepius", "", "5555555", "333 Cross Ciaro"),
			new Person("Dennis", "Reynolds", "5555555", "666 Paddys Philladelphia"),
			new Person("Ricky", "LeFleur", "5555555", "101 Liquor Sunnyvale")};
	static Person[] tempStringArray = new Person[myListOfPeople.length + 1];

	public PersonsList() {

	}

	public void addPerson() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a new contact");
		String userInput = input.nextLine();
		String[] splitInput = userInput.split(" ");
		Person newPerson = new Person(splitInput[0], splitInput[1], splitInput[2], splitInput[3]);
		for (int i = 0; i < myListOfPeople.length; i++) {
			tempStringArray[i] = myListOfPeople[i];
		}
		tempStringArray[tempStringArray.length - 1] = newPerson;
		myListOfPeople = tempStringArray;

	}

	public void getPeople() {
		System.out.println(Arrays.toString(myListOfPeople));
	}

	public void getPerson() {
		Scanner in = new Scanner(System.in);
		String userSearchTerm = in.nextLine();
		String errorMessage = "sorry i didnt find that name";
		boolean error = false;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].lname.equals(userSearchTerm)) {
				System.out.println(myListOfPeople[i]);
			}
			else if(!myListOfPeople[i].lname.equals(userSearchTerm)){
				error = true;
			}
		}
		if(error == true) {
			System.out.println(errorMessage);
		}
	}

	public void deletePerson() {
		Scanner in = new Scanner(System.in);
		String userSearchTerm = in.nextLine();
		int size = myListOfPeople.length;
		for (int i = 0; i < myListOfPeople.length; i++) {
			if (myListOfPeople[i].lname.equals(userSearchTerm)) {
				myListOfPeople[i] = null;

				System.out.println(Arrays.toString(myListOfPeople));
				size--;
			}
		}
		Person[] tempArray = new Person[size];
		for (int i = 0; i < tempArray.length; i++) {
			if (myListOfPeople[i] != null) {
				tempArray[i] = myListOfPeople[i];
			} else {
				tempArray[i] = myListOfPeople[i + 1];
			}
		}
		myListOfPeople = tempArray;
		System.out.println(Arrays.toString(myListOfPeople));
	}

	public String toString() {
		return Arrays.toString(myListOfPeople);
	}
}
