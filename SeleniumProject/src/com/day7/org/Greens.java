package com.day7.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greens  extends Baseclass{
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.gecko.driver","D:\\Selenium\\Prog\\SeleniumProject\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File sc = scr.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\\\Selenium\\\\Prog\\\\SeleniumProject\\\\Screenshot/png");
		FileUtils.copyToDirectory(sc, des);
		
	}

}
