package com.Runner.org;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;

import Com.cucumber.org.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature\\org",
glue = "com\\Runner\\org",
dryRun=false,monochrome=false,plugin="pretty")

public class Adactin_RunnerClass extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
    String BroswerName = FileReaderManager.getInstance().gecrtInstance().getBroswerName();
	 driver=BaseClass.BroswerLanch(BroswerName);
		

	}
	@AfterClass
	public static void teardown() {
		driver.close();
		driver.quit();

	}

	
	
	

}
