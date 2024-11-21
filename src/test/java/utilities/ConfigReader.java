package utilities;

import java.io.FileInputStream;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;


public class ConfigReader {
	
	private static Properties prop = null;
	private static String browserType = null;

	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	
	public static String getBrowserType() throws Throwable {
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("Browser not provided in the configuration");
	}

	public static String getProperty(String key) {
		if (prop == null)
			initializeProperty();
		return prop.getProperty(key);
	}

	public static Properties initializeProperty() {

		prop = new Properties();

		try {
			FileInputStream fileInput = new FileInputStream("./src/test/resources/Config/Config.properties");
			prop.load(fileInput);
			fileInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static String registerPage() {

		String pageUrl = prop.getProperty("registerUrl");
		if (pageUrl != null)
			return pageUrl;
		else
			throw new RuntimeException("URL is not specified");

	}

	public static String getXlsFilePath() {
		String xlsFilePath = ConfigReader.getProperty("xlsFilePath");
		if (xlsFilePath != null)
			return xlsFilePath;
		else
			throw new RuntimeException("Xls file path not specified in the config.properties file");
	}
	
	public static String randomAlphaNumeric() {
		String str = RandomStringUtils.randomAlphabetic(5);
		String num = RandomStringUtils.randomNumeric(3);

		return (str + "@" + num);

	}

}
