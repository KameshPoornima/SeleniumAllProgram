package com.Day4.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shopclues {
	public static void main(String[] args) {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("fasttrack");
		driver.findElement(By.xpath("//a[@onclick=\"searchTrigger()\"]")).click();
		driver.findElement(By.id("det_img_152865138")).click();
		driver.getWindowHandle();
		driver.findElement(By.id("add_cart")).click();
		driver.findElement(By.xpath("//span[@class=\"cart_icon_count\"]")).click();
		List<WebElement> looo = driver.findElements(By.tagName("li"));
		
		for (int i = 0; i < looo.size(); i++) {
			System.out.println(""+looo.get(i).getText());
			
		}
		driver.quit();

	}

}
