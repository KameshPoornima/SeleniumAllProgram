package com.Runnerclass.adactin;

import java.io.IOException;

import org.com.cucumber.Baseclass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Stepdefinition.adactin.stepdefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pomclass.pom;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\adactin",glue="com\\Stepdefinition\\adactin",
plugin={"pretty"/*,"junit:target/cucumber-reports/Cucumber.xml",
		"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"*/},
dryRun=false,
monochrome=false)

public class Runnerclass extends Baseclass  {
public static WebDriver driver;

@BeforeClass
public static void setup() throws IOException {
//driver=Baseclass.BroswerLanch("Firefox");
	

}
@AfterClass
public static void Teardown() {
	//driver.quit();

}

}
