package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testContactData() throws Exception {
    openMainPage();
    openContactsPage();
    ContactData contact = new ContactData("Ann", "XXX", "Kiev", "02", "03", "056", "12", "mail1", "mail22", "Rob", "Dnepr", "05662" );
   	fillContacForm(contact);
   	submitContactCreation();
    returnToHomePage();
  }
}