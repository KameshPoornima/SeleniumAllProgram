package org.lang;

public class StateDetails extends Languageinfo {
	private void Northindia() {
       System.out.println("NORTHINDIA");
	}
	private void SouthIndia() {
        System.out.println("SOUTHINDIA");
	}
	public static void main(String[] args) {
		StateDetails driver = new StateDetails();
		driver.Northindia();
		driver.SouthIndia();
		driver.Tamillanguage();
		driver.Englishlanguage();
		driver.HindiLanguage();
	}
}