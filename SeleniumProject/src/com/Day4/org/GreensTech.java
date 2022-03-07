package com.Day4.org;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hugedomains.com/domain_profile.cfm?d=greenstechnology.com");
		List<WebElement> pharagrap = driver.findElements(By.xpath("(//div[@class=\"testimonials-item_content\"])[2]"));
		System.out.println("print:"+pharagrap.size());
		
		for (int i = 0; i < pharagrap.size(); i++) {
			System.out.println(""+pharagrap.get(i).getText());
			
		}
		driver.quit();
	}
	
	
	

}