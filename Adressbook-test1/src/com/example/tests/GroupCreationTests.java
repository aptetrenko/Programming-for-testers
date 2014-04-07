package com.example.tests;

import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase{
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    
    // save old state
    List<GroupData> oldList = app.getGroupHelper().getGroups();
    
    // actions
    app.getGroupHelper().initGroupCreation();
    GroupData group = new GroupData();
    group.name = "nana123";
    group.header = "header 3";
    group.footer = "footer 3";
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();
  
    //save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    
    //compare state
    assertEquals(newList.size(), oldList.size()+1);
    
    
  }
  
  

  //@Test
  public void testEmptyGroupCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupsPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();
  }
}
