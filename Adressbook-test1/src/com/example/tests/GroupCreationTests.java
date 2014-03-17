package com.example.tests;

import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    app.NavigationHelper.openMainPage();
    app.NavigationHelper.openGroupsPage();
    app.GroupHelper.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "nana";
    group.header = "header 3";
    group.footer = "footer 3";
	app.GroupHelper.fillGroupForm(app, this, group);
    app.GroupHelper.submitGroupCreation();
    app.GroupHelper.returnToGroupsPage();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
    app.NavigationHelper.openMainPage();
    app.NavigationHelper.openGroupsPage();
    app.GroupHelper.initGroupCreation();
    app.GroupHelper.fillGroupForm(app, this, new GroupData("", "", ""));
    app.GroupHelper.submitGroupCreation();
    app.GroupHelper.returnToGroupsPage();
  }
}
