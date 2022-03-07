package com.day5.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo_guru {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement one = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
		WebElement two = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement bank = driver.findElement(By.id("bank"));
		WebElement three = driver.findElement(By.id("amt7"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(one, bank);
		ac.dragAndDrop(two, three);
		ac.perform();
		driver.quit();
		
	}
	

}
