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
	public String toString() {
		return "ContactData [firstname=" + firstname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result	+ ((firstname == null) ? 0 : firstname.hashCode());
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
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData different) {
		return this.firstname.toLowerCase().compareTo(different.firstname.toLowerCase());
	}
	
	
	
}