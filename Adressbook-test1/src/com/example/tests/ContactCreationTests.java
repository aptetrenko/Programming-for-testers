package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testContactData() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().openContactsPage();
    ContactData contact = new ContactData();
    contact.firstname = "Alex";
	contact.secondname = "Petrenko";
	contact.address = "Dnepr";
	contact.homePhone = "05662";
	contact.mobilePhone = "066578";
	contact.workPhone = "0562";
	contact.firstEmail = "mail1";
	contact.secondEmail = "mail2";
	contact.birthday = "12/May/1977";
	contact.yourGroup = "Rob";
	contact.secondaryAdress = "Nikopol";
	contact.secondaryPhone = "0566222";
    app.getContactHelper().fillContacForm(contact);
   	app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}