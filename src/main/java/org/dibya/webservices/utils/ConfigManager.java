package org.dibya.webservices.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Config Reader Class consists
 * 
 * 1. Private Constructor 
 * 2. Get Instance 
 * 3. Get String 
 * 4. Input Stream to load file
 * 
 * @author dibya
 *
 */
public class ConfigManager {

	private static ConfigManager manager;
	private static final Properties prop = new Properties();

	private ConfigManager() {
		try {
			InputStream inputStream = ConfigManager.class.getResourceAsStream("/src/test/resources/Config.properties");
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ConfigManager getInstance() {
		if (manager == null) {
			synchronized (ConfigManager.class) {
				manager = new ConfigManager();
			}
		}
		return manager;
	}

	public String getString(String key) {
		return System.getProperty(key, prop.getProperty(key));
	}
}
