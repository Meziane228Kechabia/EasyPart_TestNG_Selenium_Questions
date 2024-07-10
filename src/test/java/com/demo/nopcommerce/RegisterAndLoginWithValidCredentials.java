package com.demo.nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegisterAndLoginWithValidCredentials {
	ChromeDriver driver;
@BeforeMethod
public void setUp() {
	driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
}
@Test(priority=1)
public void registerNewAccount() {
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Meziane");
	driver.findElement(By.id("LastName")).sendKeys("Biden");
	driver.findElement(By.id("Email")).sendKeys("rewwah@yahoo.fr");
	driver.findElement(By.id("Password")).sendKeys("Meziane@123");	
}

@Test(priority=2)

public void loginWithValidCredentials () {
    driver.findElement(By.className("ico-login")).click();
    driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("rewwah@yahoo.fr");
    driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("Meziane@123");
    driver.findElement(By.xpath("//button[@type='submit' and @ class='button-1 login-button']")).click();
}
@Test(priority=3)
public void loginWithInvalidCredentials() {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("rewwah@yahoooooo.fr");
	driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("Meziane@124686");
	driver.findElement(By.xpath("//button[@type='submit' and @ class='button-1 login-button']")).click();
	
}
@AfterMethod
public void tearDown () {
	driver.quit();



}	

}
