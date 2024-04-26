package curs17;

import java.util.Properties;

public class PropertiesFileProcessor {

	public void readPropertiesFile(String key, String file) {
		try(InputStream inputStream = new FileInputStream(file)){
			Properties profile = new Properties();
			profile.load(inputStream);
			
			return profile.getProperties;
			
		}catch(IOException e) {
			System.out.println("Cannot read properties file");
		}
	}
}
