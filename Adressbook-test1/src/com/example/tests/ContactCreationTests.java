package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testContactData() throws Exception {
    app.navigationHelper.openMainPage();
    app.contactHelper.openContactsPage();
    ContactData contact = new ContactData("Kolya1", "CC", "Kiev", "02", "03", "056", "12/May/1977", "mail1", "mail22", "Rob", "Dnepr", "05662" );
   	app.contactHelper.fillContacForm(app, this, contact);
   	app.contactHelper.submitContactCreation();
    app.contactHelper.returnToHomePage();
  }
}