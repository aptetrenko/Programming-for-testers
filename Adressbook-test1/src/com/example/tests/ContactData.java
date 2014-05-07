package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	
	public String firstname;
	public String secondname;
	public String address;
	public String homePhone;
	public String mobilePhone;
	public String workPhone;
	public String firstEmail;
	public String secondEmail;
	public String bDay;
	public String bMonth;
	public String bYear;
	public String groupName;
	public String secondaryAdress;
	public String secondaryPhone;
	
	
	
	public ContactData() {
		
	}
		
	public ContactData(String firstname, String secondname, String address, String homePhone, String mobilePhone, 
		String workPhone, String firstEmail, String secondEmail, String bDay, String bMonth, String bYear, String groupName, 
		String secondaryAdress, String secondaryPhone) 
	{
		this.firstname = firstname;
		this.secondname = secondname;
		this.address = address;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.firstEmail = firstEmail;
		this.secondEmail = secondEmail;
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
		this.groupName = groupName;
		this.secondaryAdress = secondaryAdress;
		this.secondaryPhone = secondaryPhone;
		
		
	}

	@Override
	public int compareTo(ContactData other) {
		int nameComparison = this.firstname.toLowerCase().compareTo(
				other.firstname.toLowerCase());
		int lastNameComparison = this.secondname.toLowerCase().compareTo(
				other.secondname.toLowerCase());

		if (lastNameComparison != 0) {
			return lastNameComparison;
		} else {
			return nameComparison;
		}
	}

	
	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + ", secondname="
				+ secondname + "]";
	}

	@Override
	public int hashCode() {
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (secondname == null) {
			if (other.secondname != null)
				return false;
		} else if (!secondname.equals(other.secondname))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}
	
	
}