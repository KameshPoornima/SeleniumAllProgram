package Com.cucumber.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class AdactinLoginpage_POM {
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement Username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	public AdactinLoginpage_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	@FindBy(id = "login")
	private WebElement Login;
	
	

}
