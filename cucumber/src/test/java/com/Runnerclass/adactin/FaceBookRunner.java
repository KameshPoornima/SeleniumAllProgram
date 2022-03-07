package com.Runnerclass.adactin;

import org.com.cucumber.Baseclass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\adactin\\FaceBook.feature",glue="com\\Stepdefinition\\adactin",dryRun=false,monochrome=false,plugin="pretty")


public class FaceBookRunner extends Baseclass {
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void Setup() {
		//driver=Baseclass.BroswerLanch("Firefox");

	}

}
