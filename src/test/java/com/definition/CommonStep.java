package com.definition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String welcomeMsg) {

		
	}

}
