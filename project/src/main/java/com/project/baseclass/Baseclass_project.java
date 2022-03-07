package com.project.baseclass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass_project {
	public static WebDriver driver;
	private static Properties prop;
	public static WebDriver BroswerLanch(String broswername) {
		try {
			if (broswername.equalsIgnoreCase("chrome")) {
				System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
				
			}else if (broswername.equalsIgnoreCase("Firefox")) {
				System.getProperty("webdriver.geckod.driver", "D:\\Selenium\\Prog\\Sample1\\Driver\\geckodriver.exe");
				 driver = new FirefoxDriver();
				
			}
			else {
				System.out.println("Invalid Broswer");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
		

	}
	
public static void Navigate_To(String url) {
	try {
		driver.navigate().to("url");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Navigate_Forward() {
 try {
	driver.navigate().forward();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static void Navigate_Back() {
try {
driver.navigate().back();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}  
public static void Quit() {
try {
driver.quit();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void Close() {
try {
driver.close();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void ScreenShot() throws IOException {
try {
	TakesScreenshot scr = (TakesScreenshot) driver;
	File sc = scr.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\Selenium\\Prog\\Sample1\\ScreenShort/png");
	FileUtils.copyToDirectory(sc, des);
} catch (WebDriverException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public static WebDriver Loc_ID(String id) {
try {
driver.findElement(By.id(id));
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return driver;
}
public static WebDriver Loc_Name(String name) {
	try {
		driver.findElement(By.name(name));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static WebDriver Loc_LinkText(String text) {
	try {
		driver.findElement(By.linkText(text)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

	
}
public static WebDriver Loc_Xpath(String xpath) {
	try {
		driver.findElement(By.xpath(xpath)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static void Accept() {
	try {
		driver.switchTo().alert().accept();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Dismiss() {
try {
driver.switchTo().alert().dismiss();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void Prompt_Alert(String value) {
	try {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(value);
		prompt.accept();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void Robot() {
	try {
		Robot ro = new Robot();    // keyboard actions
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Maxmize() {
	try {
		driver.manage().window().maximize();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void ContextClick(String xpath) {
	try {
		Actions ac = new Actions(driver);    // mouse actions
		
		WebElement f1 = driver.findElement(By.xpath(xpath));
		ac.contextClick(f1).perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void get(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static WebDriver Loc_Xpathsendkeys(String xpath,String key) {
	try {
		driver.findElement(By.xpath(xpath)).sendKeys(key);;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static void Sendkeys(WebElement element,String keys) {
	try {
		 element.sendKeys(keys);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

public static void Click(WebElement element) {
	
	try {
		element.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}




}


