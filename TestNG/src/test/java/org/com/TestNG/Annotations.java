package org.com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Baseclass_TestNG{
	public static WebDriver driver;
	
	@BeforeSuite
	private void Setproperty() {
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\TestNG\\Driver\\chromedriver.exe");
      
	}
	
	@BeforeTest
	private void Broswer() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	private void Url() {
      driver.get("https://www.facebook.com/");
      System.out.println("Get the URL:");
      driver.getCurrentUrl();
	}
	
	@BeforeMethod
	private void Login() {
		
      System.out.println("Open login page successfully");
	}
	
	@Test
	private void FB() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("kameshkalai60@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("14411617");
		driver.findElement(By.name("login")).click();
		Actions ac = new Actions(driver);
		WebElement f1 = driver.findElement(By.xpath("(//a[@role=\"link\"])[4]"));
		ac.contextClick(f1).perform();
	Robot();
	Robot();
	Thread.sleep(5000);
	
	}
	@Test
	private void Facebook2() {
		String title = driver.getTitle();
		System.out.println("The Tittle is:"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		driver.findElement(By.xpath("(//div[@role=\"button\"])[3]")).click();
	    driver.findElement(By.xpath("(//span[@dir=\"auto\"])[9]")).click();

	}
      
	
	
	@AfterMethod
	  private void Goto() {
        System.out.println("Navigate to next page");
	}
	
	@AfterClass
	private void logout() {
		
       
	}
	
	@AfterTest
	private void close() {
    driver.close();
    driver.quit();
	}
	
	@AfterSuite
	private void deleteCookies() {
     driver.manage().deleteAllCookies();
	}
	
	

}
