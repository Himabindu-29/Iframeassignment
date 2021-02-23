package com.driver;

import java.util.concurrent.TimeUnit;

import com.runner.BaseClass;

public class ImplicitWait  extends BaseClass{
	public void applyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
