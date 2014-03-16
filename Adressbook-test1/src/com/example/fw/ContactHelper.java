package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper {

	public void submitContactCreation() {
		ApplicationManager.driver.findElement(By.name("submit")).click();
	}

	public void enterSecondaryPhone(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("phone2")).clear();
	    ApplicationManager.driver.findElement(By.name("phone2")).sendKeys(contact.secondaryPhone);
	}

	public void enterSecondaryAdress(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("address2")).clear();
	    ApplicationManager.driver.findElement(By.name("address2")).sendKeys(contact.secondaryAdress);
	}

	public void selectYourGroup(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		new Select(ApplicationManager.driver.findElement(By.name("new_group"))).selectByVisibleText(contact.yourGroup);
	}

	public void selectBirthday(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		String[] parts = contact.birthday.split("/");
		new Select(ApplicationManager.driver.findElement(By.name("bday"))).selectByVisibleText(parts[0]);
	    new Select(ApplicationManager.driver.findElement(By.name("bmonth"))).selectByVisibleText(parts[1]);
	    ApplicationManager.driver.findElement(By.name("byear")).clear();
	    ApplicationManager.driver.findElement(By.name("byear")).sendKeys(parts[2]);
	}

	public void enterSecondEmail(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("email2")).clear();
	    ApplicationManager.driver.findElement(By.name("email2")).sendKeys(contact.secondEmail);
	}

	public void enterFirstEmail(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("email")).clear();
	    ApplicationManager.driver.findElement(By.name("email")).sendKeys(contact.firstEmail);
	}

	public void enterWorkPhone(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("work")).clear();
	    ApplicationManager.driver.findElement(By.name("work")).sendKeys(contact.workPhone);
	}

	public void enterMobilePhone(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("mobile")).clear();
	    ApplicationManager.driver.findElement(By.name("mobile")).sendKeys(contact.mobilePhone);
	}

	public void enterHomePhone(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("home")).clear();
	    ApplicationManager.driver.findElement(By.name("home")).sendKeys(contact.homePhone);
	}

	public void enterAdress(String adress) {
		ApplicationManager.driver.findElement(By.name("address")).clear();
	    ApplicationManager.driver.findElement(By.name("address")).sendKeys(adress);
	}

	public void fillFullName(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		ApplicationManager.driver.findElement(By.name("firstname")).clear();
	    ApplicationManager.driver.findElement(By.name("firstname")).sendKeys(contact.firstname);
	    ApplicationManager.driver.findElement(By.name("lastname")).clear();
	    ApplicationManager.driver.findElement(By.name("lastname")).sendKeys(contact.secondname);
	}

	public void fillContacForm(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		fillFullName(applicationManager, testBase, contact);
		enterAdress(contact.adress);
	    enterHomePhone(applicationManager, testBase, contact);
	    enterMobilePhone(applicationManager, testBase, contact);
	    enterWorkPhone(applicationManager, testBase, contact);
	    enterFirstEmail(applicationManager, testBase, contact);
	    enterSecondEmail(applicationManager, testBase, contact);
	    selectBirthday(applicationManager, testBase, contact);
	    selectYourGroup(applicationManager, testBase, contact);
	    enterSecondaryAdress(applicationManager, testBase, contact);
	    enterSecondaryPhone(applicationManager, testBase, contact);
	    
	    
	}

	public void returnToHomePage() {
		ApplicationManager.driver.findElement(By.linkText("home page")).click();
	}

	public void openContactsPage() {
		ApplicationManager.driver.findElement(By.linkText("add new")).click();
	}

}
