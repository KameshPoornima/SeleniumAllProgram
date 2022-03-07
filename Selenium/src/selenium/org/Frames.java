package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames extends Baseclass {
	public static void main(String[] args) {
		
		WebDriver driver = BroswerLanch("chrome");
		get("http://demo.automationtesting.in/Frames.html");
		WebDriver loc_Xpath = Loc_Xpath("(//a[@class=\"analystic\"])[1]");
		loc_Xpath.switchTo().frame("singleframe");
        Loc_Xpathsendkeys("(//input[@type=\"text\"])[1]", "Kamesh");
        
        driver.switchTo().defaultContent();
        
        Loc_LinkText("Iframe with in an Iframe");
        //WebDriver loc = Loc_Xpath("//iframe[@src=\"MultipleFrames.html\"]");
        //driver.switchTo().frame(null)
        
        //WebDriver lo = Loc_Xpath("//iframe[@src=\"SingleFrame.html\"]");
        //driver.switchTo().frame(lo); 
        
        WebElement outerframe = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 300px;width:600px\"]"));
        driver.switchTo().frame(outerframe);
        System.out.println("Switch to Outerframe");
        
        WebElement innerframe = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
        driver.switchTo().frame(innerframe);
        System.out.println("Switch to innerframe");
        
        WebElement frame = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
        frame.sendKeys("poornima");
        System.out.println("poornima");
        
        
		
	}

}
