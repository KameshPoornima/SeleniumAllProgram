package com.Day6.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class fLIPKART {
	 public static void main(String[] args) throws AWTException {
				System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
				driver.get("https://www.flipkart.com/ ");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
				
				WebElement hf = driver.findElement(By.xpath("//a[@class=\"_6WQwDJ\"]"));
                 Actions ac = new Actions(driver);
                 ac.contextClick(hf);
                 
                 Robot ro = new Robot();
                 
                ro.keyPress(KeyEvent.VK_ENTER);
 				ro.keyRelease(KeyEvent.VK_ENTER);
 				
 				ro.keyPress(KeyEvent.VK_ENTER);
				ro.keyRelease(KeyEvent.VK_ENTER);
                 
	}

}
