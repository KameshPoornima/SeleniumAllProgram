package org.com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGALLProgram extends Baseclass_TestNG{
	@Test(groups = "A")
	private void Amazon() {
		BroswerLanch("chrome");
		get("https://www.amazon.in/");
		Quit();
	}
	
	@Test
	private void Facebook() {
		BroswerLanch("chrome");
		get("https://www.facebook.in/");
		Quit();
	}
	@Test
	private void Flipkart() {
		BroswerLanch("chrome");
		get("https://www.flipkart.in/");
		Quit();
	}
	@Test(groups = "A")
	private void Adctin() {
		BroswerLanch("chrome");
		get("https://adactinhotelapp.com/");
		Quit();
	}
	
	@Test(dataProvider = "Number")
	private void Airtel(String txtMobile) {
		BroswerLanch("chrome");
		get("https://www.airtel.in/prepaid-recharge/");
		driver.findElement(By.id("txtMobile"));
		Quit();
	}
	@DataProvider
	private Object[][] Airtel() {
		return new  Object[][] {
			{"6585255665"},
			{"55155588652"}
			
		};
		}

	
	
	@Test(priority = -1)
	private void BookmyShow() {
		BroswerLanch("chrome");
		get("https://in.bookmyshow.com/");
		Quit();
	}
	@Test(invocationCount = 3)
	private void PVR() {
		BroswerLanch("chrome");
		get("https://www.pvrcinemas.com/");
		Quit();
	}
	@Ignore
	@Test(enabled = true)
	private void Hyderabad() {
		BroswerLanch("chrome");
		get("https://en.wikipedia.org/wiki/Hyderabad");
		Quit();
	}
	
	

}
