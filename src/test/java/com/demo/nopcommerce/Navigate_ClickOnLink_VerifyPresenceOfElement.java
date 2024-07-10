package com.demo.nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate_ClickOnLink_VerifyPresenceOfElement {
@Test
	public void navigateToWebpage() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Books")).click();		
		Thread.sleep(5000);
// Verifying a book called First Prize Pies is among the books list
		driver.findElement(By.linkText("First Prize Pies")).isDisplayed();		
	}

}
