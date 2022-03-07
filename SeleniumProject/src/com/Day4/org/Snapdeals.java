package com.Day4.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeals {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement f1 = driver.findElement(By.xpath("(//div[@class=\"stats-container posRelative\"])[5]"));
		f1.click();
		driver.getWindowHandle();
		driver.findElement(By.linkText("add to cart")).click();
		driver.findElement(By.name("keyword")).sendKeys("laptop");
		driver.findElement(By.linkText("Laptop Skin aqua Premium vinyl HD printed Easy to Install Laptop Skin/Sticker/Vinyl/Cover for all size laptops")).click();
		driver.findElement(By.xpath("(//span[@class=\"intialtext\"])[1]")).click();
		driver.findElement(By.linkText("View Cart")).click();
		driver.findElement(By.id("pincode-value")).sendKeys("600067");
		List<WebElement> text = driver.findElements(By.xpath("//div[@class=\"cart-items-list clearfix\"]"));
		
		
		for (int i = 0; i < text.size(); i++) {
			System.out.println(""+text.get(i).getText());
			
		}
	}

}
