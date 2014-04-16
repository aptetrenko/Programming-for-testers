package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{
	
	@Test (dataProvider = "randomValidGroupGenerator")
	public void modifySomeGroup(GroupData group) {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().openGroupsPage();
		
		// save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    
	    Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size()-1);
	    
	    //actions
		app.getGroupHelper().initGroupModification(index);
		app.getGroupHelper().fillGroupForm(group);	
		app.getGroupHelper().submitGroupModification();	
		app.getGroupHelper().returnToGroupsPage();
		
		//save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare state
	    oldList.remove(index);
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
		
		
	}
}
	
