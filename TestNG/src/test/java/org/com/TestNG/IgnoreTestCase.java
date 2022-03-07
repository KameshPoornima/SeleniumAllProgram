package org.com.TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;


public class IgnoreTestCase extends Baseclass_TestNG {
	
	
	@BeforeMethod
	private void login() {
System.out.println("Login");
	}
@Ignore	
@Test
private void Facebook() {
BroswerLanch("chrome");
get("https://www.facebook.com/");
driver.findElement(By.name("email")).sendKeys("kameshkalai60@gmail.com");
driver.findElement(By.id("pass")).sendKeys("14411617");
driver.findElement(By.name("login")).click();
Quit();
}
@Test
private void Amazon() throws AWTException {
	BroswerLanch("chrome");
	get("https://www.amazon.in/");
	Actions ac = new Actions(driver);    // mouse actions
	
	WebElement f1 = driver.findElement(By.linkText("Fashion"));
	ac.contextClick(f1).perform();
	
	Robot ro = new Robot();    // keyboard actions
	
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);
	
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);
	Quit();

}

@Test(enabled = false)
private void Flipkart() throws InterruptedException, IOException {
BroswerLanch("chrome");
get("https://www.flipkart.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("56545478745");
TakesScreenshot scr = (TakesScreenshot) driver;
File sc = scr.getScreenshotAs(OutputType.FILE);
File des = new File("D:\\Selenium\\Prog\\TestNG\\Screenshot/png");
FileUtils.copyToDirectory(sc, des);
driver.quit();
}
@AfterMethod
private void logout() {
System.out.println("logout");
}


		

}
