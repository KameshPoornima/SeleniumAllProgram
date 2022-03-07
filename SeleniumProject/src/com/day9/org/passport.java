package com.day9.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class passport {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		WebElement l = driver.findElement(By.id("dcdrLocation"));
		Select s =  new Select(l);
		s.selectByValue("1");
		
		
		WebElement l1 = driver.findElement(By.id("hintQues"));
		Select s1 = new Select(l1);
		s1.selectByIndex(2);
		
		
		
		
		driver.quit();
				
		
	}

}
