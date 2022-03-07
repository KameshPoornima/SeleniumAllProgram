package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollUpDown extends Baseclass {
	public static void main(String[] args) {
		WebDriver driver = BroswerLanch("chrome");
		get("https://www.amazon.in/");
		/*driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("kameshkalai60@gmail.com");
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("14411617");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("6380073643");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();*/
		
		WebDriver loc_LinkText = Loc_LinkText("Become an Affiliate");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",loc_LinkText );
		//js.executeScript("arguments[0].scrollIntoView();",loc_LinkText );
		
	}

}