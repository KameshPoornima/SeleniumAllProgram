package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("56545478745");
		driver.quit();
		
		
	}

}

