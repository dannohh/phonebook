package phonebook;

import java.util.Arrays;

class Person {
	String fname;
	String lname;
	String phone;
	String address;
	

	public Person(String fname, String lname, String phone, String address) {
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
	}
	public String toString() {
		return "\n" + fname + "\n" + lname + "\n" + phone + "\n" + address + "\n";
	}
}
