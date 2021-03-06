package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	
	public ConfigurationReader() throws IOException {
		File f =new File("src\\test\\java\\com\\adactinProperty\\org\\adactin.property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
		
		
	}
	
	public String getBroswerName() {
		String Broswer = ps.getProperty("BroswerName");
		return Broswer;
	}
	
	public String getUrl() {
		String url = ps.getProperty("url");
		return url;
	}

}
