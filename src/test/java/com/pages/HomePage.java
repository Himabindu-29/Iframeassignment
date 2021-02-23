package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class HomePage extends BaseClass{
	public void clickHelpButton() {
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		action.clickOnButton();
	}
	public void switchToFrame() {
		action.switchToFrame();
	}

}
