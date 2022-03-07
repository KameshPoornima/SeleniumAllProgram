package com.day8.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bank {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}

}
