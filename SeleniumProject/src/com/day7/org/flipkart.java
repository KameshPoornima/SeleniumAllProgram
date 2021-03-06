package com.day7.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.util.Iterator;		
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {
	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		WebElement LO = driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[20]"));
		LO.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",LO );
		
		String MainWindow=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    driver.switchTo().window(ChildWindow);
                    
		 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File sc = scr.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\\\Selenium\\\\Prog\\\\SeleniumProject\\\\Screenshot/png");
		FileUtils.copyToDirectory(sc, des);

	}

}
	}
}
