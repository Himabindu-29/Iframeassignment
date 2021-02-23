package com.driver;

import com.runner.BaseClass;

import Constants.IframeConstants;

public class Action extends BaseClass{
	public void clickOnButton() {
		driver.findElement(IframeConstants.HELP).click();
	}
	public void switchToFrame() {
		driver.switchTo().frame(driver.findElement(IframeConstants.IFRAME1));
	}
	public void inputText() {
		driver.findElement(IframeConstants.INPUTTEXT).clear();
		driver.findElement(IframeConstants.INPUTTEXT).sendKeys("help ");
	}

}
