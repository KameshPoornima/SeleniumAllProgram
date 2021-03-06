package com.Stepdefinition.adactin;

import java.io.IOException;

import org.com.cucumber.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FaceBookStepdifinition extends Baseclass{
	public static WebDriver driver;
	

	@Given("User Launched The Broswer")
	public void user_launched_the_broswer() {
		driver = new FirefoxDriver();
	}
	@When("User Enters on URL")
	public void user_enters_on_url() {
		driver.get("https://www.facebook.com/");
	}
	@When("User Enters on {string}")
	public void user_enters_on(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}
	@When("User Enters on password {string}")
	public void user_enters_on_password(String string) {
		driver.findElement(By.id("pass")).sendKeys(string);
		
	}
	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("if Verifies the Login Functionality")
	public void if_verifies_the_login_functionality() throws IOException {
		System.out.println("Verified Login Functionality");
	}




}
