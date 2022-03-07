package com.day9.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettyimage {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class=\"DesktopMediaFilter-module__mainLabel___h1cMI\"]")).click();
	    driver.findElement(By.xpath("//ul[@class=\"DesktopMediaFilter-module__options___s8kmV\"]"));
	    WebElement link = driver.findElement(By.xpath("//span[@class=\"DesktopMediaFilter-module__holder___WYblR\"]"));
		Select s = new Select(link);
		s.selectByIndex(0);
		
	}

}
