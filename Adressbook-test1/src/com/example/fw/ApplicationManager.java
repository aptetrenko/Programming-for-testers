package com.example.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class ApplicationManager {

	public void returnToGroupsPage() {
		TestBase.driver.findElement(By.linkText("group page")).click();
	}

	
	/* public void returnToGroupsPage() {
		TestBase.driver.findElement(By.linkText("group page")).click();
	}
	*/

	public void submitGroupCreation() {
		TestBase.driver.findElement(By.name("submit")).click();
	}

	public void fillGroupForm(TestBase testBase, GroupData group) {
		TestBase.driver.findElement(By.name("group_name")).clear();
	    TestBase.driver.findElement(By.name("group_name")).sendKeys(group.name);
	    TestBase.driver.findElement(By.name("group_header")).clear();
	    TestBase.driver.findElement(By.name("group_header")).sendKeys(group.header);
	    TestBase.driver.findElement(By.name("group_footer")).clear();
	    TestBase.driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	}

	public void initGroupCreation() {
		TestBase.driver.findElement(By.name("new")).click();
	}

	public void openGroupsPage() {
		TestBase.driver.findElement(By.linkText("groups")).click();
	}

	public void openMainPage() {
		TestBase.driver.get(TestBase.baseUrl + "/addressbookv4.1.4/");
	}

	public boolean isElementPresent(By by) {
	    try {
	      TestBase.driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	public boolean isAlertPresent() {
	    try {
	      TestBase.driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	public String closeAlertAndGetItsText() {
	    try {
	      Alert alert = TestBase.driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (TestBase.acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      TestBase.acceptNextAlert = true;
	    }
	  }

	public void returnToHomePage() {
		TestBase.driver.findElement(By.linkText("home page")).click();
	}

	public void submitContactCreation() {
		TestBase.driver.findElement(By.name("submit")).click();
	}

	public void enterSecondaryPhone(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("phone2")).clear();
	    TestBase.driver.findElement(By.name("phone2")).sendKeys(contact.secondaryPhone);
	}

	public void enterSecondaryAdress(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("address2")).clear();
	    TestBase.driver.findElement(By.name("address2")).sendKeys(contact.secondaryAdress);
	}

	public void selectYourGroup(TestBase testBase, ContactData contact) {
		new Select(TestBase.driver.findElement(By.name("new_group"))).selectByVisibleText(contact.yourGroup);
	}

	public void selectBirthday(TestBase testBase, ContactData contact) {
		String[] parts = contact.birthday.split("/");
		new Select(TestBase.driver.findElement(By.name("bday"))).selectByVisibleText(parts[0]);
	    new Select(TestBase.driver.findElement(By.name("bmonth"))).selectByVisibleText(parts[1]);
	    TestBase.driver.findElement(By.name("byear")).clear();
	    TestBase.driver.findElement(By.name("byear")).sendKeys(parts[2]);
	}

	public void enterSecondEmail(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("email2")).clear();
	    TestBase.driver.findElement(By.name("email2")).sendKeys(contact.secondEmail);
	}

	public void enterFirstEmail(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("email")).clear();
	    TestBase.driver.findElement(By.name("email")).sendKeys(contact.firstEmail);
	}

	public void enterWorkPhone(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("work")).clear();
	    TestBase.driver.findElement(By.name("work")).sendKeys(contact.workPhone);
	}

	public void enterMobilePhone(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("mobile")).clear();
	    TestBase.driver.findElement(By.name("mobile")).sendKeys(contact.mobilePhone);
	}

	public void enterHomePhone(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("home")).clear();
	    TestBase.driver.findElement(By.name("home")).sendKeys(contact.homePhone);
	}

	public void enterAdress(String adress) {
		TestBase.driver.findElement(By.name("address")).clear();
	    TestBase.driver.findElement(By.name("address")).sendKeys(adress);
	}

	public void fillFullName(TestBase testBase, ContactData contact) {
		TestBase.driver.findElement(By.name("firstname")).clear();
	    TestBase.driver.findElement(By.name("firstname")).sendKeys(contact.firstname);
	    TestBase.driver.findElement(By.name("lastname")).clear();
	    TestBase.driver.findElement(By.name("lastname")).sendKeys(contact.secondname);
	}

	public void openContactsPage() {
		TestBase.driver.findElement(By.linkText("add new")).click();
	}

	public void fillContacForm(TestBase testBase, ContactData contact) {
		fillFullName(testBase, contact);
		enterAdress(contact.adress);
	    enterHomePhone(testBase, contact);
	    enterMobilePhone(testBase, contact);
	    enterWorkPhone(testBase, contact);
	    enterFirstEmail(testBase, contact);
	    enterSecondEmail(testBase, contact);
	    selectBirthday(testBase, contact);
	    selectYourGroup(testBase, contact);
	    enterSecondaryAdress(testBase, contact);
	    enterSecondaryPhone(testBase, contact);
	    
	    
	}

}