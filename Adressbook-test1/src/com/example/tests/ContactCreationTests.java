package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testContactData() throws Exception {
    openMainPage();
    openContactsPage();
    FullNameData name = new FullNameData("alex", "petrenko");
    name.firstname = "firstname 1";
    name.secondname = "secondname 1";
	fillFullName(name);
    enterAdress();
    enterHomePhone();
    enterMobilePhone();
    enterWorkPhone();
    enterFirstEmail();
    enterSecondEmail();
    selectBirthday();
    selectYourGroup();
    enterSecondaryAdress();
    enterSecondaryPhone();
    submitContactCreation();
    returnToHomePage();
  }
}