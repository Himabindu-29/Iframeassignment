package com.runner;

import com.driver.Action;
import com.pages.HelpPage;
import com.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static HelpPage helpPage= new HelpPage();
	public static Action action = new Action();
	public static HomePage homePage= new HomePage();
	public static String  baseURL      = "https://www.boots.com/";
	
	
	

}
