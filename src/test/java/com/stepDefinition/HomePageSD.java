package com.stepDefinition;

import org.junit.Assert;
import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSD extends BaseClass{
	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		Assert.assertEquals("Beauty | Health | Pharmacy and Prescriptions - Boots",driver.getTitle());
	    
	}

	@When("^I am click the help button$")
	public void i_am_click_the_help_button() throws Throwable {
		homePage.clickHelpButton();
	   
	}

	@When("^I swtich to the help frame$")
	public void i_swtich_to_the_help_frame() throws Throwable {
		action.switchToFrame();
	   
	}


}
