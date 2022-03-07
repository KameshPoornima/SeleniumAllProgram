package com.pom.org;

import org.openqa.selenium.WebElement;

public class Demo_site extends Baseclass_pom {
	public static void main(String[] args) throws InterruptedException {
		BroswerLanch("chrome");
		get("https://www.facebook.com/");
		
		Pom_class pc = new Pom_class(driver);
		Sendkeys(pc.getId(), "kameshkalai60@gmail.com");
		Sendkeys(pc.getPassword(), "14411617");
		Click(pc.getLogin());
		Thread.sleep(8000);
		Quit();
		
	}

}
