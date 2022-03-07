package com.SeleniumPro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Sendkeys {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("kameshkalai60@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("14411617");
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("jjjjjj");
		driver.findElement(By.id("dest")).sendKeys("jjjjjj");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("GreensTechnology");
		driver.quit();
		
		
		

		
		
	}

}
