package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
	
  @Test
  public void testContactData() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().openContactsPage();
    
    //save old state contacts
    List<ContactData> oldList = app.getContactHelper().getContacts();
    
    
    //action
    
    ContactData contact = new ContactData();
    contact.firstname = "Alex1234";
	contact.secondname = "Petrenko123";
	contact.address = "Dnepr123";
	contact.homePhone = "05662";
	contact.mobilePhone = "066578";
	contact.workPhone = "0562";
	contact.firstEmail = "mail1";
	contact.secondEmail = "mail2";
	contact.bDay = "10";
	contact.bMonth = "May";
	contact.bYear = "1989";
	contact.groupName = "Rob";
	contact.secondaryAdress = "Nikopol";
	contact.secondaryPhone = "0566222";
    app.getContactHelper().fillContacForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
    
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    //compare state
     oldList.add(contact);
     Collections.sort(oldList);
     assertEquals(newList, oldList);
    
    
  }
}