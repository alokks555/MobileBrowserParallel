package com.mobileauto.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesData {

	Properties properties;

	public Properties loadPropertiesFile(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;

	}

}
