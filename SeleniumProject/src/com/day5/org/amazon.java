package com.day5.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Mobiles")).click();
		WebElement two = driver.findElement(By.xpath("(//a[@class=\"nav-a nav-hasArrow\"])[1]"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(two).perform();
		driver.findElement(By.linkText("Power Banks")).click();
		driver.quit();
	}

}
