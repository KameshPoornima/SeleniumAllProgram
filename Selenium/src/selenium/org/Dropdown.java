package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Baseclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		
		WebElement DD = driver.findElement(By.xpath("//select[@class=\"form-control bw-currency-list\"]"));
		
		Select sel = new Select(DD);
		
		//sel.selectByValue("KWD");
		//sel.selectByIndex(4);
		//sel.selectByVisibleText(" Hong Kong Dollar");
		
		
	}

}
