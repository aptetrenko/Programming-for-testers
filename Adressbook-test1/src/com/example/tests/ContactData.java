package com.example.tests;

public class ContactData {
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
		
	public ContactData(String firstname, String secondname, String address, String homePhone, String mobilePhone, String workPhone,
		String firstEmail, String secondEmail, String bDay, String bMonth, String bYear, String groupName, 
		String yourGroup , String secondaryAdress, String secondaryPhone) 
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

}