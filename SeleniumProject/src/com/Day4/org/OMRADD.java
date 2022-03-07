package com.Day4.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OMRADD {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.greenstechnologys.com/index.html");
		List<WebElement> OMR = driver.findElements(By.xpath("(//div[@class=\"trainer-info\"])[2]"));
		
		for (int i = 0; i < OMR.size(); i++) {
			System.out.println(""+OMR.get(i).getText());
			
		}
		driver.quit();
	}
	

}
