package selenium.org;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);    // mouse actions
		
		WebElement f1 = driver.findElement(By.linkText("Fashion"));
		ac.contextClick(f1).perform();
		
		Robot ro = new Robot();    // keyboard actions
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}

}
