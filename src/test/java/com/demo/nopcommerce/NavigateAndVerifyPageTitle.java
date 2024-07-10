package com.demo.nopcommerce;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigateAndVerifyPageTitle {

@Test	
	public void navigateAndFerifyPgeTitle () {


	ChromeDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	String expectedTitle = "nopCommerce demo store";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle,"Page title mismatch. Expected: '" + expectedTitle + "'. Actual: '" + actualTitle + "'");
	}
}



