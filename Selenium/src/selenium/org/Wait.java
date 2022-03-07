package selenium.org;

import java.util.concurrent.TimeUnit;

public class Wait extends Baseclass {
	public static void main(String[] args) {
		BroswerLanch("chrome");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    get("https://www.goindigo.in/");
	    	
		
	}

}
