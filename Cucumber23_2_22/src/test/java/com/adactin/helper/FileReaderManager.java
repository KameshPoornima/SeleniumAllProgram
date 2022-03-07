package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager fir = new FileReaderManager();
		return fir;
	
	}
	
	public ConfigurationReader gecrtInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
		
	}

}
