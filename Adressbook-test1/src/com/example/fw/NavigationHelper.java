package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper {

	public void openMainPage() {
		ApplicationManager.driver.get(ApplicationManager.baseUrl + "/addressbookv4.1.4/");
	}

	public void openGroupsPage() {
		ApplicationManager.driver.findElement(By.linkText("groups")).click();
	}

}
