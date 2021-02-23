package com.stepDefinition;
import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class HelpPageSD extends BaseClass {
	
	@Then("^I should see the help frame$")
	public void i_should_see_the_help_frame() throws Throwable {
		helpPage.verifyHelpFrame();
	    
	}
	
}
