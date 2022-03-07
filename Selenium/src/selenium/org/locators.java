package selenium.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();// id
		driver.findElement(By.name("email")).sendKeys("9841413959"); // name
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("14411617"); // xpath
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();		
		driver.close();
	
}
}