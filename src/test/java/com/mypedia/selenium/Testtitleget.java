package com.mypedia.selenium;




import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testtitleget {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));

	
}
}
