package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testContactData() throws Exception {
    app.NavigationHelper.openMainPage();
    app.ContactHelper.openContactsPage();
    ContactData contact = new ContactData("Kolya1", "CC", "Kiev", "02", "03", "056", "12/May/1977", "mail1", "mail22", "Rob", "Dnepr", "05662" );
   	app.ContactHelper.fillContacForm(app, this, contact);
   	app.ContactHelper.submitContactCreation();
    app.ContactHelper.returnToHomePage();
  }
}