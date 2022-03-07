package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsample {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		driver.switchTo().alert().accept();
		
		//comform alert
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		
		//promt alert
		
		WebElement prom = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]"));
		prom.click();
		WebElement findElement = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		findElement.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("my name");
		prompt.accept();
		
		
		
		
		
	}

}
