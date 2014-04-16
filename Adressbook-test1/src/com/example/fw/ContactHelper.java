package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.GroupData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openContactsPage() {
		click(By.linkText("add new"));
	}

	
	public void fillContacForm(ContactData contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.secondname);
	    type(By.name("address"), contact.address);
	    type(By.name("home"), contact.homePhone);
	    type(By.name("mobile"), contact.mobilePhone);
	    type(By.name("work"), contact.workPhone);
	    type(By.name("email"), contact.firstEmail);
	    type(By.name("email2"), contact.secondEmail);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contact.bDay);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contact.bMonth);
	    driver.findElement(By.name("byear")).clear();
	    driver.findElement(By.name("byear")).sendKeys(contact.bYear);
	    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contact.groupName);
	    type(By.name("address2"), contact.secondaryAdress);
	    type(By.name("phone2"), contact.secondaryPhone);
	    
	    
	}
	
	public void fillOnlyName(ContactData contact) {
		type(By.name("firstname"), contact.firstname);
		
	}
	
	public void submitContactCreation() {
		click(By.name("submit"));
	}
	
	public void returnToHomePage() {
		click(By.linkText("home page"));
	}
	
	public void deleteContact(int index) {
		selectContactByIndex(index);
		click(By.xpath(".//*[@id='content']/form[2]/input[2]"));
		
	}

	private void selectContactByIndex(int index) {
		selectContactByIndex();
	}

	private void selectContactByIndex() {
		click(By.xpath(".//*[@id='maintable']/tbody/tr[2]/td[7]/a/img"));
	}

	public void initContactModification(int i) {
		selectContactByIndex();
		
	}

	public void submitContactModification() {
		click(By.xpath(".//*[@id='content']/form[1]/input[11]"));
		
	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			ContactData contact = new ContactData();
			String title = checkbox.getAttribute("title");
			contact.firstname = title.substring("Select (".length(), title.length() - ")".length());
			contacts.add(contact);
		}
		return null;
	}
	
	
}
