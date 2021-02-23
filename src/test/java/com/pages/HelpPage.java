package com.pages;

import org.junit.Assert;

import com.runner.BaseClass;

public class HelpPage extends BaseClass{
	public void verifyHelpFrame() {
		Assert.assertEquals("Beauty | Health | Pharmacy and Prescriptions - Boots",driver.getTitle());
	}

}
