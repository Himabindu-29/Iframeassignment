package com.stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}

	@After
	public void close() {
		//driver.close();
	}

}
