package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(1);
		ContactData contact = new ContactData();
		contact.firstname = "Pampam";
		app.getContactHelper().fillOnlyName(contact);
		app.getContactHelper().submitContactModification();
		app.getContactHelper().returnToHomePage();
	}

}
