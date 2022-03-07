package com.SeleniumPro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_locators {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("mobile")).sendKeys("9841855585");
		driver.findElement(By.id("name")).sendKeys("kamesh");
		driver.findElement(By.id("password")).sendKeys("kamesh@123");
		driver.findElement(By.id("email")).sendKeys("kameshmagi06@gmail.com");
		driver.findElement(By.xpath("//a[@class=\"a-ayg\"]")).click();
		driver.navigate().to("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.findElement(By.id("navbar_username")).sendKeys("kamesh@123");
		driver.findElement(By.id("navbar_password")).sendKeys("14411617");
		driver.findElement(By.id("cb_cookieuser_navbar")).click();
		driver.findElement(By.xpath("(//input[@class=\"button\"])[1]")).click();
		driver.quit();
	}

}
